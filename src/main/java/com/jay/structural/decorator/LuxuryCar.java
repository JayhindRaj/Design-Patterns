/**
 * 
 */
package com.jay.structural.decorator;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class LuxuryCar extends CarDecorator {

	/**
	 * @param car
	 */
	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Luxury Car...");
	}
}
