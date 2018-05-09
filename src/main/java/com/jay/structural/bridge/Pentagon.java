/**
 * 
 */
package com.jay.structural.bridge;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
public class Pentagon extends Shape {
	public Pentagon(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.println("Pentagon built...");
		color.applyColor();
	}
}
