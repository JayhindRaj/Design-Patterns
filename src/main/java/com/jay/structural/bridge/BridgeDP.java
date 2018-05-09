package com.jay.structural.bridge;

/**
 * Decouple an abstraction from its implementation so that the two can vary
 * independently
 * 
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
public class BridgeDP {
	public static void main(String[] args) {

		Shape trianShape = new Triangle(new GreenColor());
		trianShape.applyColor();

		Shape pentaShape = new Pentagon(new RedColor());
		pentaShape.applyColor();

		Shape square = new Square(new BlueColor());
		square.applyColor();
	}

}
