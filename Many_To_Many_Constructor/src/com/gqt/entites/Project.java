package com.gqt.entites;

public class Project {
	private int pid;
	private String pname;
	private String pmgr;
	
	public Project(int pid, String pname, String pmgr) 
	{
		this.pid = pid;
		this.pname = pname;
		this.pmgr = pmgr;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public String getPmgr() {
		return pmgr;
	}
	
}
