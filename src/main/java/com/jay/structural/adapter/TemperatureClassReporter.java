/**
 * 
 */
package com.jay.structural.adapter;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class TemperatureClassReporter extends CeliciusReporter implements
TemperatureInfo {

	@Override
	public double getTemperatureInF() {
		return cTof(tempInc);
	}

	@Override
	public void setTemperatureInF(double temperatureInF) {
		this.tempInc = fToc(temperatureInF);
	}

	@Override
	public double getTemperatureInC() {
		return tempInc;
	}

	@Override
	public void setTemperatureInC(double temperatureInC) {
		this.tempInc = temperatureInC;
	}

	private double fToc(double f) {
		return (((f - 32) * 5) / 9);
	}

	private double cTof(double c) {
		return ((c * 1.8) + 32);
	}
}
