/**
 * 
 */
package com.jay.creational.abstractfactory;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory abstractFactory) {
		return abstractFactory.createComputer();
	}
}
