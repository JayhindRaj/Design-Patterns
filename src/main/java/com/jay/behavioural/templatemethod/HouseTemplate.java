package com.jay.behavioural.templatemethod;

public abstract class HouseTemplate {

	//Template method is final so subclasses
	public final void buildHouse() {
		buildFoundations();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built...");
	}
	
	// Methods to be implement by subclasses
	public abstract void buildPillars();
	public abstract void buildWalls();
	
	// Default implementation..
	private void buildWindows() {
		System.out.println("Building Glass Windows");	
	}
	
	private void buildFoundations() {
		System.out.println("Building foundation with cement, iron, rods and sand");	
	}
}
