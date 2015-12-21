package org.cnhalo.web.controller;

import org.apache.commons.lang3.math.NumberUtils;
import org.cnhalo.entity.CommercialBuilding;
import org.cnhalo.mem.DbDataMgr;
import org.cnhalo.web.IController;

import static spark.Spark.*;
import static org.cnhalo.util.JsonUtil.*;

/**
 *
 *
 * @author	HuangYijie
 * @date	2015年12月21日 下午10:25:22
 * 
 */
public class CommercialBuildingCtrlr implements IController {

	public CommercialBuildingCtrlr() {
		
		get("/commercialbuildings", (req, res) -> DbDataMgr.getInstance().getCommercialBuildings(), json());
		
		get("/commercialbuilding/:id", (req, res) -> {
			String id = req.params(":id");
			if(NumberUtils.isNumber(id)) {
				CommercialBuilding cb = DbDataMgr.getInstance().getCommercialBuildingById(Integer.parseInt(id));
				if(cb != null) {
					return cb;
				}
			}
			res.status(400);
			return "unfound";
		}, json());
	}
	
}
