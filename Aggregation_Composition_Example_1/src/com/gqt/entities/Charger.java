package com.gqt.entities;

public class Charger {
	private String bread;
	private float voltage;
	
	public Charger(String bread, float voltage) 
	{
		this.bread = bread;
		this.voltage = voltage;
	}

	public String getBread() {
		return bread;
	}

	public float getVoltage() {
		return voltage;
	}
	
}
