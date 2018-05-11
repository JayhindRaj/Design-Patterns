/**
 * 
 */
package com.jay.creational.abstractfactory;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class Server extends Computer {
	private String ram;
	private String hdd;
	private String cpu;

	public Server(String ram, String hdd, String pcu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = pcu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}
}
