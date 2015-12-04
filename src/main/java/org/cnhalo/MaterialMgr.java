package org.cnhalo;

import org.cnhalo.factory.AnimalFeed;
import org.cnhalo.factory.Chemistry;
import org.cnhalo.factory.Electron;
import org.cnhalo.factory.Glass;
import org.cnhalo.factory.Metal;
import org.cnhalo.factory.Mineral;
import org.cnhalo.factory.Plastic;
import org.cnhalo.factory.Seed;
import org.cnhalo.factory.SugarSpice;
import org.cnhalo.factory.Textile;
import org.cnhalo.factory.Wood;

/**
 * 材料管理
 *
 * @author	HuangYijie
 * @date	2015年12月3日 下午8:45:12
 * 
 */
public class MaterialMgr {
	
	// 初始化每种材料
	
	// 工厂材料
	
	// 金属
	public static final Material METAL = new Metal();
	// 木材
	public static final Material WOOD = new Wood(); 
	// 塑料
	public static final Material PLASTIC = new Plastic(); 
	// 种子
	public static final Material SEED = new Seed(); 
	// 矿物质
	public static final Material MINERAL = new Mineral(); 
	// 化学物质
	public static final Material CHEMISTRY = new Chemistry();
	// 纺织品
	public static final Material TEXTILE = new Textile(); 
	// 糖和香料
	public static final Material SUGAR_SPICE = new SugarSpice(); 
	// 玻璃
	public static final Material GLASS = new Glass(); 
	// 动物饲料
	public static final Material ANIMALFEED = new AnimalFeed();
	// 电子元件
	public static final Material ELECTRON = new Electron(); 
	
	
}
