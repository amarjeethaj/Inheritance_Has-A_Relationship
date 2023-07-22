package com.gqt.entities;

public class Employee {
	private int empid;
	private String empName;
	private String empAdd;
	
	private Account acc;

	public Employee(int empid, String empName, String empAdd, Account acc) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empAdd = empAdd;
		this.acc = acc;
	}
	
	public void disp()
	{
		System.out.println("Employee Detail:");
		System.out.println("Employee_ID   :"+empid);
		System.out.println("Employee_Name :"+empName);
		System.out.println("Employee_Address :"+empAdd);
		System.out.println("Account Detail:");
		System.out.println("Account_no.  :"+acc.getAccNo());
		System.out.println("Account_Type :"+acc.getAccType());
		System.out.println("Account_Name :"+acc.getAccName());
	}
	
}
