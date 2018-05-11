/**
 * 
 */
package com.jay.behavioural.chainofrespo;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class EarthHandler extends PlanetHandler {

	@Override
	public void handleRequest(PlanetEnum planet) {

		if (planet == PlanetEnum.EARTH) {
			System.out.println("EarthHandler handle " + planet);
			System.out.println("Earth is comfortable!!\n");
		} else {
			System.out.println("EarthHandler does not handle " + planet);
			if (successor != null) {
				successor.handleRequest(planet);
			}
		}
	}
}
