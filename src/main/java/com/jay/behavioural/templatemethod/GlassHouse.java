package com.jay.behavioural.templatemethod;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}
}
