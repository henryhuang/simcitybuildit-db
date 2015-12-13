package org.cnhalo.util;

import java.io.File;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.cnhalo.SqliteTest;

/**
 *
 *
 * @author HuangYijie
 * @date 2015年12月6日 上午1:48:00
 * 
 */
public class PathUtil {
	
	/**
	 * get project work base path
	 *
	 * @return
	 */
	public static final String getWorkPath() {
		return new File(".").getAbsolutePath();
	}

	/**
	 * get the dir base project work
	 *
	 * @param dirs
	 * @return
	 * @see #getWorkPath()
	 */
	public static final String getFileWorkPath(String... dirs) {
		return StringUtils.join(ArrayUtils.addAll(new String[] { getWorkPath() }, dirs), File.separator);
	}

	/**
	 * get the sqlite file path
	 *
	 * @param fileName
	 * @return
	 */
	public static String getSqlFilePath(String fileName) {
		return SqliteTest.class.getResource("/").getPath() + "sql" + File.separator + fileName;
	}
	
}
