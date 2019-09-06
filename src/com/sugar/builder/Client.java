package com.sugar.builder;

public class Client {
	public static void main(String[] args) {
		
		AirShipDirector director = new SZAirshipDirector(new SZAirShipBuilder());

		AirShip ship = director.directAirShip();
		
		System.out.println(ship.getEngine().getName());
		
		ship.launch();
		
	}
}
