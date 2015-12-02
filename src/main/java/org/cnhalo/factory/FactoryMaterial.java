package org.cnhalo.factory;

import org.cnhalo.Material;
import org.cnhalo.Time;

/**
 * 工厂素材
 *
 * @author	HuangYijie
 * @date	2015年12月2日 下午11:21:49
 * 
 */
public class FactoryMaterial implements Material {
	
	private int cash;
	private Time time;
	
	public FactoryMaterial(int cash, int hour, int minute, int second) {
		this.cash = cash;
		this.time = new Time(hour, minute, second);
	}
	
	@Override
	public Time getTimeSpent() {
		return time;
	}

	@Override
	public int getCash() {
		return cash;
	}
	
	@Override
	public String toString() {
		return String.format("Time: %s, Cash: %d", time.toString(), cash);
	}

}
