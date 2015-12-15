package org.cnhalo.entity.material;

import java.util.List;
import java.util.Set;

import org.cnhalo.entity.CommercialBuilding;
import org.cnhalo.entity.Material;
import org.cnhalo.entity.MaterialCount;
import org.cnhalo.entity.Time;



/**
 *
 *
 * @author	HuangYijie
 * @date	2015年12月13日 下午10:41:48
 * 
 */
public class CommercialMaterial implements Material {
	
	private String id;
	private String item;
	private int lvl;
	private int maxLevel;
	private Time time;
	private List<MaterialCount> mats;
	private int maxCost;
	private int profit;
	private int perMin;
	private Set<Material> usedIn;
	private String img;
	private CommercialBuilding store;
	
	public CommercialMaterial(String id, String item, int lvl, int maxLevel, Time time,
			List<MaterialCount> mats, int maxCost, int profit, int perMin, Set<Material> usedIn,
			String img, CommercialBuilding store) {
		super();
		this.id = id;
		this.item = item;
		this.lvl = lvl;
		this.maxLevel = maxLevel;
		this.time = time;
		this.mats = mats;
		this.maxCost = maxCost;
		this.profit = profit;
		this.perMin = perMin;
		this.usedIn = usedIn;
		this.img = img;
		this.store = store;
	}

	public String getId() {
		return id;
	}

	public String getItem() {
		return item;
	}

	public int getLvl() {
		return lvl;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public Time getTime() {
		return time;
	}

	public List<MaterialCount> getMats() {
		return mats;
	}

	public int getMaxCost() {
		return maxCost;
	}

	public int getProfit() {
		return profit;
	}

	public int getPerMin() {
		return perMin;
	}

	public Set<Material> getUsedIn() {
		return usedIn;
	}

	public String getImg() {
		return img;
	}

	public CommercialBuilding getStore() {
		return store;
	}
	
}
