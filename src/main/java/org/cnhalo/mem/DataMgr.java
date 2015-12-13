package org.cnhalo.mem;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.io.FileUtils;
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
public class DataMgr {

	private static Logger logger = LoggerFactory.getLogger(DataMgr.class.getName());

	private Map<String, FactoryMeterial> id2FactoryMaterial = new ConcurrentHashMap<>();
	private Map<String, String> fmItem2Id = new ConcurrentHashMap<>();
	
	private static class SingletonContainer {
		private static DataMgr instance = new DataMgr();
	}

	public static DataMgr getInstance() {
		return SingletonContainer.instance;
	}

	private DataMgr() {
		load();
	}

	private void load() {

		try {
			id2FactoryMaterial.clear();

			try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {

				File file = new File(PathUtil.getSqlFilePath("material_factory.sql"));

				String sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);

					try (ResultSet rs = statement
							.executeQuery("select ID, ITEM, LVL, MAX_VALUE, TIME_MIN, IMG from TB_FACTORY_MATERIAL")) {
						while (rs.next()) {
							String id = rs.getString(1);
							String item = rs.getString(2);
							FactoryMeterial fm = new FactoryMeterial(id, item, rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6));
							id2FactoryMaterial.put(id, fm);
							fmItem2Id.put(item, id);
						}
					}
				}
			}

		} catch (Exception e) {
			logger.error("load data from sqlite error", e);
		}

	}
	
	public FactoryMeterial getFactoryMeterialById(String id) {
		return id2FactoryMaterial.get(id);
	}
	
	public String getFactoryMeterialIdByItem(String item) {
		return fmItem2Id.get(item);
	}
	
	public Set<String> getFactoryMeterialIdSet() {
		return id2FactoryMaterial.keySet();
	}
	
}
