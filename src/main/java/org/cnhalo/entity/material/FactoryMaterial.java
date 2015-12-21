package org.cnhalo.entity.material;

import org.cnhalo.entity.Material;
import org.cnhalo.entity.Time;


/**
 *
 *
 * @author HuangYijie
 * @date 2015年12月13日 下午10:11:13
 * 
 */
public class FactoryMaterial implements Material {

	private String id;
	private String item;
	private int level;
	private int maxLevel;
	private Time time;
	private String img;

	public FactoryMaterial(String id, String item, int level, int maxLevel, int timeInMin,
			String img) {
		this.id = id;
		this.item = item;
		this.level = level;
		this.maxLevel = maxLevel;
		this.time = Time.buildFromMin(timeInMin);
		this.img = img;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return String.format("id: %s, item: %s, level: %d, maxLevel: %d, time: %s, img: %s", id,
				item, level, maxLevel, time, img);
	}

}
