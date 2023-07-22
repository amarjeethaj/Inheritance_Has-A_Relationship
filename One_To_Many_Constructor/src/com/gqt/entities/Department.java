package com.gqt.entities;

public class Department 
{
	private int deptId;
	private String deptName;
	private  String deptloc;
	private Employee [] Employees;
	
	public Department(int deptId, String deptName, String deptloc, Employee[] employees) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptloc = deptloc;
		Employees = employees;
	}
	
	public void display()
	{
		System.out.println("Department Detail:");
		System.out.println("Department Id:"+deptId);
		System.out.println("Departmet Name :"+deptName);
		System.out.println("Department Location: "+deptloc);
		System.out.println("Employee Detail:");
		for(Employee emp:Employees)
		{
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
		}
	}
	
}
