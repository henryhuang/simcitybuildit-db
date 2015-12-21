package org.cnhalo.web.controller;

import static org.cnhalo.util.JsonUtil.json;
import static spark.Spark.get;

import org.cnhalo.entity.material.FactoryMaterial;
import org.cnhalo.mem.DbDataMgr;
import org.cnhalo.web.IController;

/**
 *
 *
 * @author HuangYijie
 * @date 2015年12月21日 下午10:24:51
 * 
 */
public class FactoryMaterialCtrlr implements IController {

	public FactoryMaterialCtrlr() {
		get("/factorymaterials", (req, res) -> DbDataMgr.getInstance().getFactoryMaterials(),
				json());

		get("/factorymaterial/:id", (req, res) -> {
			String id = req.params(":id");
			FactoryMaterial cb = DbDataMgr.getInstance().getFactoryMaterialById(id);
			if (cb != null) {
				return cb;
			}
			res.status(400);
			return "unfound";
		}, json());

	}

}
