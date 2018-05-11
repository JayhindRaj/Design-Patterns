/**
 * 
 */
package com.jay.behavioural.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class WeatherStation implements WeatherSubject {

	Set<WeatherObserver> observers;
	int temperature;
	public WeatherStation(int temp) {
		observers = new HashSet<WeatherObserver>();
		this.temperature = temp;
	}

	@Override
	public void addObserver(WeatherObserver observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(WeatherObserver observer) {
		observers.remove(observer);

	}

	@Override
	public void doNotify() {
		Iterator<WeatherObserver> it = observers.iterator();

		while (it.hasNext()) {
			WeatherObserver observer = it.next();
			observer.doUpdate(temperature);
		}
	}

	public void setTemperature(int newTemp) {
		System.out.println("\n Weatherstation setting temperature to " + newTemp);
		temperature = newTemp;
		doNotify();
	}
}
