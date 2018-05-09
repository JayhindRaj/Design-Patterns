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
