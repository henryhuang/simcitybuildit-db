package org.cnhalo;

/**
 * 材料
 *
 * @author	HuangYijie
 * @date	2015年12月2日 下午11:11:39
 * 
 */
public interface Material {
	
	/**
	 * 获取完整工期
	 *
	 * @return
	 */
	public Time getTimeSpent();
	
	/**
	 * 获取购买需要的钱
	 *
	 * @return
	 */
	public int getCash();
	
}
