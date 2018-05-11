/**
 * 
 */
package com.jay.behavioural.chainofrespo;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public abstract class PlanetHandler {
	PlanetHandler successor;

	public void setSuccessor(PlanetHandler successor) {
		this.successor = successor;
	}

	public abstract void handleRequest(PlanetEnum planet);
}
