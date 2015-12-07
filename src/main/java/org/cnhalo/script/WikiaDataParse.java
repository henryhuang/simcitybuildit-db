package org.cnhalo.script;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

import org.cnhalo.util.PathUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Parse data of Wikia to SQL
 *
 * @author HuangYijie
 * @date 2015年12月6日 上午1:42:10
 * 
 */
public class WikiaDataParse {

	private static final Map<Integer, String> STOREID_2_FILE = new LinkedHashMap<Integer, String>() {
		private static final long serialVersionUID = 5871173947613453321L;
		{
			put(1, "build_supplies_store.html");
			put(2, "hardware_store.html");
			put(3, "farmers_market.html");
			put(4, "furniture_store.html");
			put(5, "gardening_supplies.html");
			put(6, "donut_shop.html");
			put(7, "fashion_store.html");
			put(8, "fast_food_restaurant.html");
			put(9, "home_appliances.html");
		}
	};

	public static void main(String[] args) throws Exception {

		// factory materials
		// genFactoryMaterial();

		// commercial materials
		// genCommercialMaterial();

		// TODO special materials
		genSpecialItems();
	}

	public static void genCommercialMaterial() {

		STOREID_2_FILE.forEach((storeId, fileName) -> {

			try {
				File file = new File(PathUtil.getFileWorkPath("doc", "wikia", fileName));
				Document document = Jsoup.parse(file, "GBK");
				Elements ths = document.select("html body table thead tr th");
				Map<String, Object> cacheTemplate = new LinkedHashMap<>();
				ths.forEach(t -> {
					cacheTemplate.put(getThText(t), "");
				});

				Elements trsInTBody = document.select("html body table tbody tr");

				StringBuilder ret = new StringBuilder();

				trsInTBody.forEach(tr -> {
					Map<String, Object> cache = new LinkedHashMap<>(cacheTemplate);
					String id = "";
					for (int j = 0; j < tr.children().size(); j++) {
						List<String> keyList = new ArrayList<String>(cache.keySet());
						Element td = tr.child(j);
						String text = "";
						if (j == 0) {
							// 第一列有图标，处理
						cache.put("IMG", td.select("a img").attr("src"));
						id = td.select("a img").attr("alt");
						text = td.ownText();
					} else if (j == 4 || j == 8) {
						text = getMats(td);
					} else {
						text = td.ownText();
					}
					cache.put(keyList.get(j), text);
				}
				cache.put("STORE_ID", storeId);
				ret.append(ParseUtil.buildSQL(cache, "TB_COMMERCIAL_MATERIAL", id));
				ret.append("\n");
			})	;

				System.out.println("/**");
				System.out.println(" * " + fileName.replace(".html", ""));
				System.out.println(" */ ");
				System.out.println(ret.toString());
				System.out.println();

			} catch (Exception e) {
				e.printStackTrace();
			}

		});

	}

	public static void genFactoryMaterial() throws Exception {

		File file = new File(PathUtil.getFileWorkPath("doc", "wikia", "factory_raw_material.html"));
		Document document = Jsoup.parse(file, "GBK");
		Elements ths = document.select("html body table thead tr th");
		Map<String, Object> cacheTemplate = new LinkedHashMap<>();
		final AtomicInteger colIndex = new AtomicInteger(0);
		ths.forEach(new Consumer<Element>() {
			@Override
			public void accept(Element t) {
				if (colIndex.get() == 4) {
					return;
				}
				cacheTemplate.put(getThText(t), "");
				colIndex.incrementAndGet();
			}
		});

		Elements trsInTBody = document.select("html body table tbody tr");
		trsInTBody.forEach(new Consumer<Element>() {
			@Override
			public void accept(Element tr) {
				Map<String, Object> cache = new LinkedHashMap<>(cacheTemplate);
				List<String> keyList = new ArrayList<String>(cache.keySet());

				String id = "";
				for (int j = 0; j < tr.children().size() && j < colIndex.get(); j++) {
					Element td = tr.child(j);
					if (j == 0) {
						// 第一列有图标，处理
						cache.put("IMG", td.select("a img").attr("src"));
						id = td.select("a img").attr("alt");
					}
					cache.put(keyList.get(j), td.ownText());
				}

				System.out.println(ParseUtil.buildSQL(cache, "TB_FACTORY_MATERIAL", id));
			}
		});
	}

	public static void genSpecialItems() throws Exception {

		File file = new File(PathUtil.getFileWorkPath("doc", "wikia", "special_items.html"));
		Document document = Jsoup.parse(file, "GBK");
		// Special items doesn't have thead
		Elements trs = document.select("html body table tbody tr");
		Map<String, Object> cacheTemplate = new LinkedHashMap<>();
		
		// first raw is keys
		Element trOfth = trs.get(0);
		trOfth.children().forEach(th -> {
			cacheTemplate.put(getThText(th), "");
		});

//		System.out.println(cacheTemplate);
		
		List<Element> trsOftd = trs.subList(1, trs.size());
		trsOftd.forEach(tr -> {
			
			Elements tds = tr.select("td");
			if(tds.size() != 0) {
				StringBuilder ret = new StringBuilder();
				Map<String, Object> cache = new LinkedHashMap<>(cacheTemplate);

				String id = "";
				for (int j = 0; j < tds.size(); j++) {
					Element td = tds.get(j);
					List<String> keyList = new ArrayList<String>(cache.keySet());
					String text = "";
					if (j == 0) {
						// 第一列有图标，处理
						cache.put("IMG", td.select("a img").attr("src"));
						id = td.select("a img").attr("alt");
						text = td.ownText();
					} else if (j == 2) {
						text = td.ownText().trim().replaceAll(",", "");
					} else if (j == 3) {
						text = getCondOfUnlocked(td);
					} else {
						text = td.ownText();
					}
					cache.put(keyList.get(j), text.replaceAll("'|’|‘", ""));
				}
				ret.append(ParseUtil.buildSQL(cache, "TB_SPECIAL_ITEMS", id));
				System.out.println(ret);
			}
		});

	}

	/**
	 * 获取节点的纯文本
	 *
	 * @return
	 */
	private static String getThText(Element ele) {
		return ele.ownText().replaceAll(" ", "_").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("\\.", "").toUpperCase();
	}
	
	/**
	 * get the condition of unlocked
	 *
	 * @param td
	 * @return
	 */
	private static String getCondOfUnlocked(Element td) {
		String ownText = td.ownText().trim();
		if(ownText.startsWith("Level")) {
			return ownText.replaceAll(" ", "");
		} else {
			return "Population" + ownText.replaceAll("\"", "").replaceAll(",|\\.", "");
		}
	}

	/**
	 * get the mats of commercial material
	 *
	 * @param matsTd
	 * @return
	 */
	private static String getMats(Element matsTd) {
		String[] count = new String[] {};
		if (matsTd.ownText() != null) {
			count = matsTd.ownText().replaceAll("x", "*").split(" ");
		}
		StringBuilder sb = new StringBuilder();
		Elements as = matsTd.select("a");
		for (int i = 0; i < as.size(); i++) {
			sb.append(as.get(i).select("img").attr("alt"));
			if (i < count.length) {
				sb.append(count[i]);
			}
			if (i != as.size() - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

}
