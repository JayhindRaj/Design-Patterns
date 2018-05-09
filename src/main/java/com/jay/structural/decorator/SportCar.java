/**
 * 
 */
package com.jay.structural.decorator;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class SportCar extends CarDecorator {

	/**
	 * @param car
	 */
	public SportCar(Car car) {
		super(car);

	}

	/* (non-Javadoc)
	 * @see com.jay.structural.decorator.CarDecorator#assemble()
	 */
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of sport car...");
	}
}
