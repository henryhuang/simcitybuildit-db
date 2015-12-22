package org.cnhalo.web.controller;

import static org.cnhalo.util.JsonUtil.json;
import static spark.Spark.get;

import java.util.HashMap;

import org.apache.commons.lang3.math.NumberUtils;
import org.cnhalo.entity.CommercialBuilding;
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
 * @date 2015年12月21日 下午10:25:22
 * 
 */
public class CommercialBuildingCtrlr implements IController {

	public CommercialBuildingCtrlr() {

		get("/commercialbuildings", new TopRoute() {

			@Override
			public Object handleJson(Request request, Response response) throws Exception {
				return DbDataMgr.getInstance().getCommercialBuildings();
			}

			@Override
			public ModelAndView handleHtml(Request request, Response response) throws Exception {
				// TODO
				return new ModelAndView(new HashMap<String, String>() {

					private static final long serialVersionUID = 1L;
					{
						put("message", json().render(handleJson(request, response)));
						put("title", "commercialbuildings.ftl");
					}
				}, "commercialbuildings.ftl");
			}

		});

		get("/commercialbuilding/:id", new TopRoute() {

			@Override
			public Object handleJson(Request request, Response response) throws Exception {
				String id = request.params(":id");
				if (NumberUtils.isNumber(id)) {
					CommercialBuilding cb = DbDataMgr.getInstance().getCommercialBuildingById(
							Integer.parseInt(id));
					if (cb != null) {
						return cb;
					}
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
						put("title", "commercialbuilding.ftl");
					}
				}, "commercialbuilding.ftl");
			}
		});
	}

}
