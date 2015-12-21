package org.cnhalo.web.controller;

import static org.cnhalo.util.JsonUtil.json;
import static spark.Spark.get;

import org.cnhalo.entity.material.CommercialMaterial;
import org.cnhalo.mem.DbDataMgr;
import org.cnhalo.web.IController;

/**
 *
 *
 * @author HuangYijie
 * @date 2015年12月21日 下午10:24:11
 * 
 */
public class CommercialMaterialCtrlr implements IController {

	public CommercialMaterialCtrlr() {
		get("/commercialmaterials", (req, res) -> DbDataMgr.getInstance().getCommercialMaterials(),
				json());

		get("/commercialmaterial/:id", (req, res) -> {
			String id = req.params(":id");
			CommercialMaterial cb = DbDataMgr.getInstance().getCommercialMaterialById(id);
			if (cb != null) {
				return cb;
			}
			res.status(400);
			return "unfound";
		}, json());
		
	}

}
