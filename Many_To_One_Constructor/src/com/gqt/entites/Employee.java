package com.gqt.entites;

public class Employee {
	private int empid;
	private String empName;
	
	private Branch branch;

	public Employee(int empid, String empName, Branch branch) {
		
		this.empid = empid;
		this.empName = empName;
		this.branch = branch;
	}
	public void display()
	{
		System.out.println("Employee Detail: ");
		System.out.println(empid+ " "+empName);
		System.out.println("Branch Detail :");
		System.out.println(branch.getBid()+" "+branch.getBloc());
		System.out.println();
	}
	
	
}
