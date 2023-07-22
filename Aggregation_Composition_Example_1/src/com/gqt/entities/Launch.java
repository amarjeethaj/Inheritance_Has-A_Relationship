package com.gqt.entities;

public class Launch {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		
		Charger ch = new Charger("Apple", 35);
		m.setcharger(ch);
		
		System.out.println(m.os.getOsname());
		System.out.println(m.os.getOssize());
		System.out.println(m.charger.getBread());
		System.out.println(m.charger.getVoltage());
		
		System.out.println(ch.getBread());
		System.out.println(ch.getVoltage());

	}

}
