package com.jay.creational.builder;

public class BuilderPattern {
	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("8GB", "I7", "1TB")
				.setBluetoth(true)
				.build();
		
		Computer computer2 = new Computer.ComputerBuilder("16GB", "I7", "512GB")
		.setBluetoth(true).setGraphicsCard(true)
		.build();
		
		Computer computer3 = new Computer.ComputerBuilder("4GB", "I5", "512GB")
		.build();
		
		System.out.println(computer);
		System.out.println(computer2);
		System.out.println(computer3);
	}
}

class Computer {

	// Mandatory
	private String ram;
	private String cpu;
	private String hdd;
	
	// Optional
	private boolean graphicsCard;
	private boolean bluetoth;

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd
				+ ", graphicsCard=" + graphicsCard + ", bluetoth=" + bluetoth
				+ "]";
	}

	private Computer(ComputerBuilder builder) {
		this.bluetoth = builder.bluetoth;
		this.ram = builder.ram;
		this.cpu = builder.cpu;
		this.hdd = builder.hdd;
		this.graphicsCard = builder.graphicsCard;
	}

	public String getRam() {
		return ram;
	}

	public String getCpu() {
		return cpu;
	}
	
	public boolean isGraphicsCard() {
		return graphicsCard;
	}

	public boolean isBluetoth() {
		return bluetoth;
	}
	
	static class ComputerBuilder {
		private String ram;
		private String cpu;
		private String hdd;
		private boolean graphicsCard;

		public boolean getGraphicsCard() {
			return graphicsCard;
		}

		private boolean bluetoth;

		public ComputerBuilder(String ram, String cpu, String hdd) {
			this.ram = ram;
			this.cpu = cpu;
			this.hdd = hdd;
		}

		public boolean getBluetoth() {
			return bluetoth;
		}

		public ComputerBuilder setBluetoth(boolean bluetoth) {
			this.bluetoth = bluetoth;
			return this;
		}

		public String getRam() {
			return ram;
		}

		public String getCpu() {
			return cpu;
		}

		public String getHdd() {
			return hdd;
		}

		public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
			this.graphicsCard = graphicsCard;
			return this;
		}

		public Computer build() {
			Computer computer = new Computer(this);
			return computer;
		}
	}
}