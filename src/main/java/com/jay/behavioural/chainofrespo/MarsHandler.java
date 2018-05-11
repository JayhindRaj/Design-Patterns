/**
 * 
 */
package com.jay.behavioural.chainofrespo;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class MarsHandler extends PlanetHandler {

	@Override
	public void handleRequest(PlanetEnum planet) {
		if(planet == PlanetEnum.MARS) {
			System.out.println("MarsHandler handle " + planet);
			System.out.println("Mars is red.\n");
		} else {
			if(successor!= null) {
				System.out.println("MarsHandler does not handle " + planet);	
				successor.handleRequest(planet);
			}
		}
	}

}
