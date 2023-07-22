package com.gqt.entities;


public class Employee {
	private int empid;
	private String empName;
	
	private Project [] projects;

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setProjects(Project[] projects) {
		this.projects = projects;
	}

	public int getEmpid() {
		return empid;
	}

	public String getEmpName() {
		return empName;
	}

	public Project[] getProjects() {
		return projects;
	}
	public void edisp()
	{
		System.out.println("Employee Detail:");
		System.out.println(empid+" "+empName);
		System.out.println("Project Detail:");
		for(Project prj:projects) 
		{
			System.out.println(prj.getPid()+" "+prj.getPname()+" "+prj.getPmgr());
			
		}
		System.out.println();
	}
}
