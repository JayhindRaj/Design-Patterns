package com.jay.structural.proxy;

/**
 * Allows for object level access control by acting as a pass through entity or
 * a placeholder object.
 * 
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class ProxyDP {
	public static void main(String[] args) throws Exception {
		Internet internet = new ProxyInternet();
		internet.connectTo("geeksforgeeks.org");
		//		internet.connectTo("msn.bingo.com");
		internet.connectTo("sapient.com");
		//		internet.connectTo("abc.com");

	}
}