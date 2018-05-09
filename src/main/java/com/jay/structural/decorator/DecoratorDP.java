package com.jay.structural.decorator;

/**
 * Decorator design pattern is used to modify the functionality of an object at
 * runtime. At the same time other instances of the same class will not be
 * affected by this, so individual object gets the modified behavior. Decorator
 * design pattern is one of the structural design pattern and uses abstract classes or
 * interface with composition to implement.
 * 
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class DecoratorDP {

	public static void main(String[] args) {
		Car sportCar = new SportCar(new BasicCar());
		sportCar.assemble();

		Car luxuryCar = new LuxuryCar(new BasicCar());

		luxuryCar.assemble();

		Car specialCar =  new SportCar(new LuxuryCar(new BasicCar()));

		specialCar.assemble();

	}
}
