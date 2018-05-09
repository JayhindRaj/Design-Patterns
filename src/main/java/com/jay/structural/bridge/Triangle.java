/**
 * 
 */
package com.jay.structural.bridge;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
public class Triangle extends Shape {


	/**
	 * @param c
	 */
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle built...");
		color.applyColor();
	}

}
