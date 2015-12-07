package org.cnhalo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import junit.framework.TestCase;

import org.apache.commons.io.FileUtils;

/**
 *
 *
 * @author HuangYijie
 * @date 2015年12月3日 下午9:55:07
 * 
 */
public class SqliteTest extends TestCase {

	public void testCommercialMaterials() {

		try {
			try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {
				assertEquals(true, conn.isValid(1000));

				File file = new File(getSqlFilePath("commercial_building.sql"));
				assertEquals(true, file.exists());

				String sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);

					try (ResultSet rs = statement.executeQuery("select count(*) from TB_COMMERCIAL_BUILDING")) {
						if (rs.next()) {
							assertEquals(9, rs.getInt(1));
						}

					}
				}
				
				file = new File(getSqlFilePath("commercial_material.sql"));
				assertEquals(true, file.exists());

				sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);

					try (ResultSet rs = statement.executeQuery("select count(*) from TB_COMMERCIAL_MATERIAL")) {
						if (rs.next()) {
							assertEquals(43, rs.getInt(1));
						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void testCommercialBuildings() {

		try {
			try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {
				assertEquals(true, conn.isValid(1000));

				File file = new File(getSqlFilePath("commercial_building.sql"));
				assertEquals(true, file.exists());

				String sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);

					try (ResultSet rs = statement.executeQuery("select count(*) from TB_COMMERCIAL_BUILDING")) {
						if (rs.next()) {
							assertEquals(9, rs.getInt(1));
						}

					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void testFactoryMaterials() {

		try {
			try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {
				assertEquals(true, conn.isValid(1000));

				File file = new File(getSqlFilePath("material_factory.sql"));
				assertEquals(true, file.exists());

				String sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);
					
					try (ResultSet rs = statement.executeQuery("select count(*) from TB_FACTORY_MATERIAL")) {
						if (rs.next()) {
							assertEquals(11, rs.getInt(1));
						}
					}
					try (ResultSet rs = statement.executeQuery("select * from TB_FACTORY_MATERIAL")) {
						String[] colums = new String[]{
								"ID", "ITEM", "LVL", "MAX_VALUE", "TIME_MIN", "IMG"
						};
						if (rs.next()) {
							// 测试一下列
							ResultSetMetaData metaData = rs.getMetaData();
							for (int i = 1; i < metaData.getColumnCount(); i++) {
								assertEquals(colums[i - 1], metaData.getColumnName(i));
							}
						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void testSpecialItems() {

		try {
			try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {
				assertEquals(true, conn.isValid(1000));

				File file = new File(getSqlFilePath("special_items.sql"));
				assertEquals(true, file.exists());

				String sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);
					
					try (ResultSet rs = statement.executeQuery("select count(*) from TB_SPECIAL_ITEMS")) {
						if (rs.next()) {
							assertEquals(21, rs.getInt(1));
						}
					}
					try (ResultSet rs = statement.executeQuery("select * from TB_SPECIAL_ITEMS")) {
						String[] colums = new String[]{
								"ID", "ITEM", "DESCRIPTION", "MAX_VALUE", "UNLOCKED_AT", "IMG"
						};
						if (rs.next()) {
							// 测试一下列
							ResultSetMetaData metaData = rs.getMetaData();
							for (int i = 1; i < metaData.getColumnCount(); i++) {
								assertEquals(colums[i - 1], metaData.getColumnName(i));
							}
						}
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static String getSqlFilePath(String fileName) {
		return SqliteTest.class.getResource("/").getPath() + fileName;
	}
	
}
