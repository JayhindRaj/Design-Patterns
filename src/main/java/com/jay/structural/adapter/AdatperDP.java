package com.jay.structural.adapter;

public class AdatperDP {

	public static void main(String[] args) {
		System.out.println("By Class Adapter");
		TemperatureInfo info = new TemperatureClassReporter();
		testTempInfo(info);

		System.out.println("By Obtect Adapter");
		TemperatureInfo info1 = new TemperatureObjectRepoter();
		testTempInfo(info1);
	}

	public static void testTempInfo(TemperatureInfo info) {

		info.setTemperatureInC(20);

		System.out.println("temp in C:" + info.getTemperatureInC());
		System.out.println("temp in F:" + info.getTemperatureInF());

		info.setTemperatureInC(80);

		System.out.println("temp in C:" + info.getTemperatureInC());
		System.out.println("temp in F:" + info.getTemperatureInF());

		info.setTemperatureInC(60);

		System.out.println("temp in C:" + info.getTemperatureInC());
		System.out.println("temp in F:" + info.getTemperatureInF());

		info.setTemperatureInC(40);

		System.out.println("temp in C:" + info.getTemperatureInC());
		System.out.println("temp in F:" + info.getTemperatureInF());


		info.setTemperatureInF(100);

		System.out.println("temp in C:" + info.getTemperatureInC());
		System.out.println("temp in F:" + info.getTemperatureInF());

		info.setTemperatureInF(4);

		System.out.println("temp in C:" + info.getTemperatureInC());
		System.out.println("temp in F:" + info.getTemperatureInF());
	}
}
