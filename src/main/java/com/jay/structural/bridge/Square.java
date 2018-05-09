/**
 * 
 */
package com.jay.structural.bridge;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
public class Square extends Shape {
	public Square(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.println("Square built...");
		color.applyColor();
	}
}
