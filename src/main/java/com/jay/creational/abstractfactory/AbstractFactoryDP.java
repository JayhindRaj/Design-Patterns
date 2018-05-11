package com.jay.creational.abstractfactory;

/**
 * 
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class AbstractFactoryDP {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("8GB", "2TB", "I7 2.4 GHz"));
		System.out.println(pc);

		Computer server = ComputerFactory.getComputer(new ServerFactory("16GB", "4TB", "I7 3.1 GHz"));
		System.out.println(server);
	}
}
