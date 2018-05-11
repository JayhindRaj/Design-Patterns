package com.jay.behavioural.chainofrespo;

public class ChainOfResponsibiltyDP {
	public static void main(String[] args) {
		PlanetHandler handler = setUpChain();

		handler.handleRequest(PlanetEnum.MARS);
		handler.handleRequest(PlanetEnum.JUPITER);
		handler.handleRequest(PlanetEnum.MERCURY);
		handler.handleRequest(PlanetEnum.EARTH);
		handler.handleRequest(PlanetEnum.NEPTUNE);
		handler.handleRequest(PlanetEnum.SATURN);
		handler.handleRequest(PlanetEnum.VENUS);


		System.out.println("*********** Money Dispenser *************");
		Dispenser dispenser = setUpDispenserChain();

		dispenser.dispense(500);
		dispenser.dispense(237);
		dispenser.dispense(350);
		dispenser.dispense(5450);
		dispenser.dispense(3300);
		dispenser.dispense(1850);
		dispenser.dispense(1530);

	}

	public static PlanetHandler setUpChain() {
		PlanetHandler mercuryHandler = new MercuryHandler();
		EarthHandler earthHandler = new EarthHandler();
		VenusHanlder venusHanlder = new VenusHanlder();
		MarsHandler marsHandler = new MarsHandler();

		mercuryHandler.setSuccessor(venusHanlder);
		venusHanlder.setSuccessor(marsHandler);
		marsHandler.setSuccessor(earthHandler);

		return mercuryHandler;
	}

	public static Dispenser setUpDispenserChain() {
		Rs500Dispenser rs500Dispenser= new Rs500Dispenser();
		Rs100Dispenser rs100Dispenser = new Rs100Dispenser();
		Rs50Dispenser rs50Dispenser = new Rs50Dispenser();
		rs500Dispenser.setSuccessor(rs100Dispenser);
		rs100Dispenser.setSuccessor(rs50Dispenser);

		return rs500Dispenser;
	}	
}
