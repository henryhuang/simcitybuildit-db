package org.cnhalo.entity;

/**
 *
 *
 * @author	HuangYijie
 * @date	2015年12月13日 下午11:10:39
 * 
 */
public class CommercialBuilding {
	
	private int id;
	private String name;
	private String caption;
	
	public CommercialBuilding(int id, String name, String caption) {
		super();
		this.id = id;
		this.name = name;
		this.caption = caption;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCaption() {
		return caption;
	}
	
}
