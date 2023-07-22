package com.gqt.entities;

public class OperatingSystem {
	private String osname;
	private int ossize;
	
	public OperatingSystem(String osname, int ossize) {
		this.osname = osname;
		this.ossize = ossize;
	}

	public String getOsname() {
		return osname;
	}

	public int getOssize() {
		return ossize;
	}
	
}
