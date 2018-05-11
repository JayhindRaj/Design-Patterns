/**
 * 
 */
package com.jay.creational.abstractfactory;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public abstract class Computer {

	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getHDD()=" + getHDD()
				+ ", getCPU()=" + getCPU() + "]";
	}
}
