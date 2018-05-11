/**
 * 
 */
package com.jay.behavioural.observer;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class WeatherCustomer1 implements WeatherObserver {
	@Override
	public void doUpdate(int temp) {
		System.out.println("Weather customer 1 just found out the temperature is:" + temp);
	}
}
