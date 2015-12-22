package org.cnhalo.web.controller;

import static org.cnhalo.util.JsonUtil.json;
import static spark.Spark.get;

import java.util.HashMap;

import org.cnhalo.entity.material.CommercialMaterial;
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
 * @date 2015年12月21日 下午10:24:11
 * 
 */
public class CommercialMaterialCtrlr implements IController {

	public CommercialMaterialCtrlr() {
		get("/commercialmaterials", new TopRoute() {
			
			@Override
			public Object handleJson(Request request, Response response) throws Exception {
				return DbDataMgr.getInstance().getCommercialMaterials();
			}
			
			@Override
			public ModelAndView handleHtml(Request request, Response response) throws Exception {
				// TODO
				return new ModelAndView(new HashMap<String, String>() {

					private static final long serialVersionUID = 1L;
					{
						put("message", json().render(handleJson(request, response)));
						put("title", "commercialmaterials.ftl");
					}
				}, "commercialmaterials.ftl");
			}
		});

		get("/commercialmaterial/:id", new TopRoute() {
			
			@Override
			public Object handleJson(Request request, Response response) throws Exception {
				String id = request.params(":id");
				CommercialMaterial cb = DbDataMgr.getInstance().getCommercialMaterialById(id);
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
						put("title", "commercialmaterial.ftl");
					}
				}, "commercialmaterial.ftl");
			}
		});
		
	}

}
