package com.gqt.entities;



public class Project {
	private int pid;
	private String pname;
	private String pmgr;
	
	private Employee[] Employees;

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPmgr(String pmgr) {
		this.pmgr = pmgr;
	}

	public void setEmployee(Employee... employee) {
		Employees = employee;
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

	public Employee[] getEmployee() {
		return Employees;
	}
	public void pdisp()
	{
		System.out.println("Project Detail:");
		System.out.println(pid+" "+pname+" "+pmgr);
		System.out.println("Employee Detail:");
		for(Employee emp: Employees)
		{
			System.out.println(emp.getEmpid()+" "+emp.getEmpName());
		}
		System.out.println();
	}
	
	
}
