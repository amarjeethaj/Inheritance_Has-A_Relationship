package com.gqt.test;

import com.gqt.entities.*;

public class launch {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpId(100);
		emp1.setEmpName("Amarjeeth gound");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(200);
		emp2.setEmpName("Amarjeeth");
		
		Employee emp3 = new Employee();
		emp3.setEmpId(300);
		emp3.setEmpName("Amar");
		
		Employee[] e = new Employee[3];
		e[0]=emp1;
		e[1]=emp2;
		e[2]=emp3;
		Department d = new Department();
		d.setDeptId(12);
		d.setDeptName("CSE");
		d.setDeptloc("bangalore");
		d.setEmployee(e);
		System.out.println(d);
	}

}
