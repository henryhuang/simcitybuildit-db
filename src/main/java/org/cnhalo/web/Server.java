package org.cnhalo.web;

import static org.cnhalo.util.JsonUtil.toJson;
import static spark.Spark.exception;

import org.cnhalo.web.controller.CommercialBuildingCtrlr;
import org.cnhalo.web.controller.CommercialMaterialCtrlr;
import org.cnhalo.web.controller.FactoryMaterialCtrlr;
import org.cnhalo.web.error.ResponseError;

/**
 *
 *
 * @author HuangYijie
 * @date 2015年12月21日 下午10:22:57
 * 
 */
public class Server {

	public static void main(String[] args) {

		new CommercialBuildingCtrlr();
		new CommercialMaterialCtrlr();
		new FactoryMaterialCtrlr();

		exception(IllegalArgumentException.class, (e, req, res) -> {
			res.status(400);
			res.body(toJson(new ResponseError(e)));
		});

	}

}
