package com.sugar.builder;


public class SZAirShipBuilder implements AirShipBuilder {
	//StringBuilder, 以后学习XML解析中，JDOM库中的类：DomBuilder,SaxBuilder
	@Override
	public Engine builderEngine() {
		System.out.println("构建神舟发动机！");
		return new Engine("神舟发动机！");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		
		System.out.println("构建逃逸塔");
		return new EscapeTower("神舟逃逸塔");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建轨道舱");
		return new OrbitalModule("神舟轨道舱");
	}	
	
}
