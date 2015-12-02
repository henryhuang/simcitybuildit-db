package org.cnhalo.commercial;

import org.cnhalo.Material;
import org.cnhalo.Time;

/**
 * 商业素材
 *
 * @author	HuangYijie
 * @date	2015年12月2日 下午11:58:56
 * 
 */
public class CommercialMaterial implements Material {
	
	private Time time;
	private Material[] materials;
	
	public CommercialMaterial(int hour, int minute, int second, Material... materials) {
		this.time = new Time(hour, minute, second);
		this.materials = materials;
	}

	@Override
	public Time getTimeSpent() {
		return time;
	}

	@Override
	public int getCash() {
		int ret = 0;
		for(Material material : materials) {
			ret = ret + material.getCash();
		}
		return ret;
	}

}
