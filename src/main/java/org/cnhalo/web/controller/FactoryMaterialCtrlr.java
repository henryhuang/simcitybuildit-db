package org.cnhalo.web.controller;

import static org.cnhalo.util.JsonUtil.json;
import static spark.Spark.get;

import java.util.HashMap;

import org.cnhalo.entity.material.FactoryMaterial;
import org.cnhalo.mem.DbDataMgr;
import org.cnhalo.web.IController;
import org.cnhalo.web.route.TopRoute;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

/**
 *
 *
 * @author HuangYijie
 * @date 2015年12月21日 下午10:24:51
 * 
 */
public class FactoryMaterialCtrlr implements IController {

	public FactoryMaterialCtrlr() {
		get("/factorymaterials", new TopRoute() {
			
			@Override
			public Object handleJson(Request request, Response response) throws Exception {
				return DbDataMgr.getInstance().getFactoryMaterials();
			}
			
			@Override
			public ModelAndView handleHtml(Request request, Response response) throws Exception {
				// TODO
				return new ModelAndView(new HashMap<String, String>() {

					private static final long serialVersionUID = 1L;
					{
						put("message", json().render(handleJson(request, response)));
						put("title", "factorymaterials.ftl");
					}
				}, "factorymaterials.ftl");
			}
		});

		get("/factorymaterial/:id", new TopRoute() {
			
			@Override
			public Object handleJson(Request request, Response response) throws Exception {
				String id = request.params(":id");
				FactoryMaterial cb = DbDataMgr.getInstance().getFactoryMaterialById(id);
				if (cb != null) {
					return cb;
				}
				response.status(400);
				return "unfound";
			}
			
			@Override
			public ModelAndView handleHtml(Request request, Response response) throws Exception {
				// TODO
				return new ModelAndView(new HashMap<String, String>() {

					private static final long serialVersionUID = 1L;
					{
						put("message", json().render(handleJson(request, response)));
						put("title", "factorymaterial.ftl");
					}
				}, "factorymaterial.ftl");
			}
		});

	}

}
