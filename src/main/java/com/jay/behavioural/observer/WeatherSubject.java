/**
 * 
 */
package com.jay.behavioural.observer;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public interface WeatherSubject {
	public void addObserver(WeatherObserver observer);
	public void removeObserver(WeatherObserver observer);
	public void doNotify();
}
