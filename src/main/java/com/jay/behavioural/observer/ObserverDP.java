package com.jay.behavioural.observer;

public class ObserverDP {

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation(33);

		WeatherCustomer1 customer1 = new WeatherCustomer1();
		WeatherCustomer2 customer2 = new WeatherCustomer2();

		station.addObserver(customer1);
		station.addObserver(customer2);

		station.setTemperature(36);
		station.setTemperature(29);

		station.removeObserver(customer1);

		station.setTemperature(34);
	}
}