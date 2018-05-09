/**
 * 
 */
package com.jay.structural.proxy;

/**
 * @author jayrajpo
 * @Sinnce May 9, 2018
 */
public class RealInternet implements Internet {
	@Override
	public void connectTo(String serverHost) throws Exception {
		System.out.println("Connecting to " + serverHost);
	}

}
