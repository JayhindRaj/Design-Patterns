/**
 * 
 */
package com.jay.structural.flyweight;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class FlyweightMultiplier implements FlyWeight {

	String operation = "Multiplying";	

	public FlyweightMultiplier() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doMath(int a, int b) {
		System.out.println(operation + " " + a + " and " + b + ": " + (a * b));

	}

}
