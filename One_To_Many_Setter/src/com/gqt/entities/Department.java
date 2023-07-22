package com.gqt.entities;

public class Department {

	private int deptId;
	private String deptName;
	private  String deptloc;
	private Employee [] Employees;
	
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setDeptloc(String deptloc) {
		this.deptloc = deptloc;
	}
	public void setEmployee(Employee[] Employee) {
		this.Employees = Employee ;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("DEPARTMENT DETAIL:").append("\n");
        sb.append("Department Id=").append(deptId).append("\n");
        sb.append("Department Nmae :").append(deptloc).append("\n")
          .append("Department loction=").append(deptName).append("\n").append("\n")
          .append("EMPLOYEE DETAIL:").append("\n");
        for(Employee emp:Employees)
		{
			sb.append(emp.getEmpId()).append("\n");			
			sb.append(emp.getEmpName()).append("\n");
		}
        return sb.toString();
    }
	
				
	}

