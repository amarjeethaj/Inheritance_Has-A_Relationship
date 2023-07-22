package com.gqt.entities;

public class Mobile {
	OperatingSystem os = new OperatingSystem("IOS", 400);
	Charger charger;
	public void setcharger(Charger charger)
	{
		this.charger=charger;
	}
}
