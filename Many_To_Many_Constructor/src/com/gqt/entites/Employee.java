package com.gqt.entites;

public class Employee {
	private int empid;
	private String empName;
	
	private Project[] projects;

	public Employee(int empid, String empName, Project... projects) 
	{
		this.empid = empid;
		this.empName = empName;
		this.projects = projects;
	}
	
	public void disp()
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
