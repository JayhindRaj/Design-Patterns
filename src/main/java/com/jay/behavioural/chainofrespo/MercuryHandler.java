/**
 * 
 */
package com.jay.behavioural.chainofrespo;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class MercuryHandler extends PlanetHandler {
	@Override
	public void handleRequest(PlanetEnum planet) {
		if(planet == PlanetEnum.MERCURY) {
			System.out.println("MercuryHandler handle " + planet);
			System.out.println("Mercury is hot.\n");
		} else {
			System.out.println("MercuryHandler does not handle " + planet);
			if(successor != null) {
				successor.handleRequest(planet);
			}
		}
	}
}
