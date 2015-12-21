package org.cnhalo.mem;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.io.FileUtils;
import org.cnhalo.entity.CommercialBuilding;
import org.cnhalo.entity.Material;
import org.cnhalo.entity.MaterialCount;
import org.cnhalo.entity.material.CommercialMaterial;
import org.cnhalo.entity.material.FactoryMaterial;
import org.cnhalo.util.PathUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 *
 * @author HuangYijie
 * @date 2015年12月13日 下午10:04:10
 * 
 */
public class DbDataMgr {

	private static Logger logger = LoggerFactory.getLogger(DbDataMgr.class.getName());

	/**
	 * id -> commercial building
	 */
	private Map<Integer, CommercialBuilding> id2CommercialBuilding = new ConcurrentHashMap<>();

	/**
	 * id -> factory material
	 */
	private Map<String, FactoryMaterial> id2FactoryMaterial = new ConcurrentHashMap<>();

	/**
	 * factory material item -> id
	 */
	private Map<String, String> fmItem2Id = new ConcurrentHashMap<>();

	/**
	 * id -> commercial material
	 */
	private Map<String, CommercialMaterial> id2CommercialMaterial = new ConcurrentHashMap<>();

	/**
	 * commercial material item -> id
	 */
	private Map<String, String> cmItem2Id = new ConcurrentHashMap<>();

	private static class SingletonContainer {
		private static DbDataMgr instance = new DbDataMgr();
	}

	public static DbDataMgr getInstance() {
		return SingletonContainer.instance;
	}

	private DbDataMgr() {
		load();
	}

	private void load() {

		try {
			id2CommercialBuilding.clear();
			id2FactoryMaterial.clear();

			try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {

				File file = new File(PathUtil.getSqlFilePath("commercial_building.sql"));
				String sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);

					try (ResultSet rs = statement
							.executeQuery("select ID, NAME, CAPTION from TB_COMMERCIAL_BUILDING")) {
						while (rs.next()) {
							int id = rs.getInt(1);
							CommercialBuilding cb = new CommercialBuilding(id, rs.getString(1),
									rs.getString(2));
							id2CommercialBuilding.put(id, cb);
						}
					}
				}

				file = new File(PathUtil.getSqlFilePath("factory_material.sql"));

				sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);

					try (ResultSet rs = statement
							.executeQuery("select ID, ITEM, LVL, MAX_VALUE, TIME_MIN, IMG from TB_FACTORY_MATERIAL")) {
						while (rs.next()) {
							String id = rs.getString(1);
							String item = rs.getString(2);
							FactoryMaterial fm = new FactoryMaterial(id, item, rs.getInt(3),
									rs.getInt(4), rs.getInt(5), rs.getString(6));
							id2FactoryMaterial.put(id, fm);
							fmItem2Id.put(item, id);
						}
					}
				}

				// CommercialMaterial
				file = new File(PathUtil.getSqlFilePath("commercial_material.sql"));

				sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);

					try (ResultSet rs = statement
							.executeQuery("select ID, ITEM, LVL, MAX_VALUE, TIME_MIN, MATS, MAT_COST, PROFIT, PER_MIN, USED_IN, IMG, STORE_ID from TB_COMMERCIAL_MATERIAL")) {
						while (rs.next()) {
							String id = rs.getString(1);
							String item = rs.getString(2);
							List<MaterialCount> mats = new ArrayList<>();
							Set<Material> usedIn = new HashSet<>();
							CommercialMaterial cm = new CommercialMaterial(id, item, rs.getInt(3),
									rs.getInt(4), rs.getInt(5), mats, rs.getInt(7), rs.getInt(8),
									rs.getInt(9), usedIn, rs.getString(11),
									id2CommercialBuilding.get(rs.getInt(12)));
							id2CommercialMaterial.put(id, cm);
							cmItem2Id.put(item, id);
						}
					}
				}

			}

		} catch (Exception e) {
			logger.error("load data from sqlite error", e);
		}

	}

	public Set<FactoryMaterial> getFactoryMaterials() {
		return new HashSet<>(id2FactoryMaterial.values());
	}
	
	public FactoryMaterial getFactoryMaterialById(String id) {
		return id2FactoryMaterial.get(id);
	}

	public String getFactoryMaterialIdByItem(String item) {
		return fmItem2Id.get(item);
	}

	public Set<String> getFactoryMaterialIdSet() {
		return id2FactoryMaterial.keySet();
	}

	public Set<CommercialMaterial> getCommercialMaterials() {
		return new HashSet<>(id2CommercialMaterial.values());
	}
	
	public CommercialMaterial getCommercialMaterialById(String id) {
		return id2CommercialMaterial.get(id);
	}

	public String getCommercialMaterialIdByItem(String item) {
		return cmItem2Id.get(item);
	}

	public Set<String> getCommercialMaterialIdSet() {
		return id2CommercialMaterial.keySet();
	}
	
	public Set<CommercialBuilding> getCommercialBuildings() {
		return new HashSet<>(id2CommercialBuilding.values());
	}
	
	public CommercialBuilding getCommercialBuildingById(Integer id) {
		return id2CommercialBuilding.get(id);
	}
	
}
