/**
 * 
 */
package com.jay.behavioural.chainofrespo;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class VenusHanlder extends PlanetHandler {
	@Override
	public void handleRequest(PlanetEnum planet) {
		if(planet == PlanetEnum.VENUS) {
			System.out.println("VenusHandler handle " + planet);
			System.out.println("Venus is poisnus.\n");
		} else {
			System.out.println("VenusHandler does not handle " + planet);
			if(successor!= null) {
				successor.handleRequest(planet);
			}
		}	
	}
}
