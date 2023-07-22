package com.gqt.test;

import com.gqt.entities.*;

public class launch {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setEmpid(20);
		emp1.setEmpName("Amar");
		
		Employee emp2=new Employee();
		emp2.setEmpid(30);
		emp2.setEmpName("jeeth");
		
		Employee emp3=new Employee();
		emp3.setEmpid(40);
		emp3.setEmpName("monish");
		
		Project prj1 = new Project();
		prj1.setPid(2023);
		prj1.setPname("JAVA");
		prj1.setPmgr("Dilip");
		prj1.setEmployee(emp1,emp2,emp3);
		
		Project prj2 = new Project();
		prj2.setPid(2023);
		prj2.setPname("Python");
		prj2.setPmgr("Rakesh");
		prj2.setEmployee(emp2,emp3);
		
		Project prj3 = new Project();
		prj3.setPid(2023);
		prj3.setPname("C++");
		prj3.setPmgr("Rohith");
		prj3.setEmployee(emp3);
		
		prj1.pdisp();
		prj2.pdisp();
		prj3.pdisp();
	}

}
