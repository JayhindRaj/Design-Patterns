/**
 * 
 */
package com.jay.structural.bridge;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 9, 2018
 */
public abstract class Shape {
	protected Color color;

	public Shape(Color c) {
		this.color = c;
	}

	abstract public void applyColor();
}
