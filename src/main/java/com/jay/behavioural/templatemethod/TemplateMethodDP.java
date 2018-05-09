package com.jay.behavioural.templatemethod;

public class TemplateMethodDP {
	public static void main(String[] args) {
		HouseTemplate houseTemplate = new WoodenHouse();
		houseTemplate.buildHouse();
		
		HouseTemplate houseTemplate2 = new GlassHouse();
		houseTemplate2.buildHouse();
	}
}
