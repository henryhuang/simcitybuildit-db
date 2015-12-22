package org.cnhalo.web.route;

import static org.cnhalo.util.JsonUtil.json;

import org.cnhalo.web.view.TemplateService;

import spark.ModelAndView;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.template.freemarker.FreeMarkerEngine;
import freemarker.cache.ClassTemplateLoader;
import freemarker.template.Configuration;

/**
 *
 *
 * @author	HuangYijie
 * @date	2015年12月22日 下午10:23:42
 * 
 */
public abstract class TopRoute implements Route {
	
	private static final Configuration CONFIGURATION = new Configuration();

	static {
		CONFIGURATION.setTemplateLoader(new ClassTemplateLoader(TemplateService.class, "templates"));
	}

	public static final FreeMarkerEngine FREE_MARKER_ENGINE = new FreeMarkerEngine(CONFIGURATION);
	
	private static boolean shouldReturnHtml(Request request) {
	    String accept = request.headers("Accept");
	    return accept != null && accept.contains("text/html");
	}
	
	@Override
	public Object handle(Request request, Response response) throws Exception {
		if(shouldReturnHtml(request)) {
			response.type("text/html");
			new ModelAndView("", "");
			return FREE_MARKER_ENGINE.render(handleHtml(request, response));
		} else {
			response.type("application/json");
			return json().render(handleJson(request, response));
		}
	}
	
	public abstract ModelAndView handleHtml(Request request, Response response) throws Exception;
	public abstract Object handleJson(Request request, Response response) throws Exception;

}
