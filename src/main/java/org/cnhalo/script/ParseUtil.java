package org.cnhalo.script;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 *
 * @author	HuangYijie
 * @date	2015年12月6日 下午3:00:58
 * 
 */
public class ParseUtil {

	public static final String buildSQL(Map<String, Object> map, String table, String id) {
		StringBuilder colSb = new StringBuilder(map.size() * 8);
		StringBuilder valueSb = new StringBuilder(map.size() * 8);
		colSb.append("'ID', ");
		valueSb.append("'" + id + "', ");
		Iterator<Map.Entry<String, Object>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Object> entry = itr.next();
			colSb.append(col2String(entry.getKey()));
			valueSb.append(value2String(entry.getValue()));
			if(itr.hasNext()) {
				colSb.append(", ");
				valueSb.append(", ");
			}
		}
		return String.format("INSERT INTO %s (%s) values (%s);", table, colSb.toString(), valueSb.toString());
	}
	
	private static final String value2String(Object obj) {
		return NumberUtils.isNumber(obj.toString()) ? obj.toString() : "'" + obj.toString() + "'";
	}
	
	private static final String col2String(String colm) {
		return "'" + colm + "'";
	}
	
}
