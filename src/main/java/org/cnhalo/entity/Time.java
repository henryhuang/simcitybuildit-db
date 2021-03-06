package org.cnhalo.entity;

/**
 * 时间对象
 *
 *
 * @author	HuangYijie
 * @date	2015年12月2日 下午11:27:03
 *
 */
public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	@Override
	public String toString() {
		return String.format("Hour: %s, Minute: %s, Second: %s", hour, minute, second);
	}
	
	public static Time buildFromMin(int timeInMin) {
		int hour = 0;
		int minute = 0;
		int second = 0;
		if(timeInMin < 60) {
			minute = timeInMin;
		} else {
			hour = timeInMin / 60;
			minute = timeInMin % 60;
		}
		return new Time(hour, minute, second);
	}
	
}
