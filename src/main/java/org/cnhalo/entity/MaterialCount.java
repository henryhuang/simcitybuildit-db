package org.cnhalo.entity;

/**
 * Material + Count
 *
 * @author	HuangYijie
 * @date	2015年12月16日 上午12:13:14
 * 
 */
public class MaterialCount {

	private Material material;
	private int count;
	
	public MaterialCount(Material material, int count) {
		this.material = material;
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public Material getMaterial() {
		return material;
	}
	
}
