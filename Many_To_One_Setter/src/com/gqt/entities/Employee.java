package com.gqt.entities;

public class Employee {
	private int empid;
	private String empName;
	
	private Branch branch;

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String toString()
	{
		return "\nEmployee Detail:\n"
				+empid+" "+empName+"\n"+"\n"+
				"Branch Detail :"+" \n"+branch.getBid()+" "+branch.getBloc();
	}
}
