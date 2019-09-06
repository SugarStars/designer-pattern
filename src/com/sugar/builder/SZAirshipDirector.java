package com.sugar.builder;

public class SZAirshipDirector implements AirShipDirector {

	private AirShipBuilder builder;

	public SZAirshipDirector(AirShipBuilder builder) {
		this.builder = builder;
	}


	@Override
	public AirShip directAirShip() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		//装配成飞船对象
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		
		return ship;
	}

}
