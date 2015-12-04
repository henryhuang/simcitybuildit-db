package org.cnhalo;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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

	public void testMaterialCommercial() {

		try {
			try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {
				assertEquals(true, conn.isValid(1000));

				File file = new File(getSqlFilePath("init.sql"));
				assertEquals(true, file.exists());

				String sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.execute(sqlContent);
				}
				
				file = new File(getSqlFilePath("commercial.sql"));
				assertEquals(true, file.exists());

				sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);

					try (ResultSet rs = statement.executeQuery("select count(*) from TB_COMMERCIAL_BUILDING")) {
						if (rs.next()) {
							assertEquals(9, rs.getInt(1));
						}

					}
				}
				
				file = new File(getSqlFilePath("material_commercial.sql"));
				assertEquals(true, file.exists());

				sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);

					try (ResultSet rs = statement.executeQuery("select count(*) from TB_MATERIAL_COMMERCIAL")) {
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
	
	public void testCommercial() {

		try {
			try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {
				assertEquals(true, conn.isValid(1000));

				File file = new File(getSqlFilePath("commercial.sql"));
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
	
	public void testMaterialFactory() {

		try {
			try (Connection conn = DriverManager.getConnection("jdbc:sqlite::memory:")) {
				assertEquals(true, conn.isValid(1000));

				File file = new File(getSqlFilePath("material_factory.sql"));
				assertEquals(true, file.exists());

				String sqlContent = FileUtils.readFileToString(file);
				try (Statement statement = conn.createStatement()) {
					statement.executeUpdate(sqlContent);

					try (ResultSet rs = statement.executeQuery("select count(*) from TB_MATERIAL_FACTORY")) {
						if (rs.next()) {
							assertEquals(11, rs.getInt(1));
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
