/**
 * 
 */
package com.jay.structural.adapter;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class TemperatureObjectRepoter implements TemperatureInfo {

	CeliciusReporter celiciusReporter;
	public TemperatureObjectRepoter() {
		celiciusReporter = new CeliciusReporter();
	}

	@Override
	public double getTemperatureInF() {
		return cTof(celiciusReporter.getTempInc());
	}

	@Override
	public void setTemperatureInF(double temperatureInF) {
		celiciusReporter.setTempInc(fToc(temperatureInF));
	}

	@Override
	public double getTemperatureInC() {
		return celiciusReporter.getTempInc();
	}

	@Override
	public void setTemperatureInC(double temperatureInC) {
		celiciusReporter.setTempInc(temperatureInC);
	}

	private double fToc(double f) {
		return (((f - 32) * 5) / 9);
	}

	private double cTof(double c) {
		return ((c * 1.8) + 32);
	}
}
