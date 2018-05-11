/**
 * 
 */
package com.jay.creational.abstractfactory;

/**
 * @author Jayhind Rajpoot
 * @Sinnce May 11, 2018
 */
public class PC extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String pcu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = pcu;
	}

	/* (non-Javadoc)
	 * @see com.jay.creational.abstractfactory.Computer#getRAM()
	 */
	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	/* (non-Javadoc)
	 * @see com.jay.creational.abstractfactory.Computer#getHDD()
	 */
	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	/* (non-Javadoc)
	 * @see com.jay.creational.abstractfactory.Computer#getCPU()
	 */
	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
