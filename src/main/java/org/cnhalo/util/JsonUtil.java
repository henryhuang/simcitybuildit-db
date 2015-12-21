package org.cnhalo.util;

import spark.ResponseTransformer;

import com.google.gson.Gson;

/**
 *
 *
 * @author	HuangYijie
 * @date	2015年12月21日 下午10:31:31
 * 
 */
public class JsonUtil {

	public static String toJson(Object object) {
		return new Gson().toJson(object);
	}
	
	public static ResponseTransformer json() {
		return JsonUtil::toJson;
	}
	
}
