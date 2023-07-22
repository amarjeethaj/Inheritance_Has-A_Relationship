package com.gqt.test;

import com.gqt.entities.*;

public class launch {

	public static void main(String[] args) {
		Branch b = new Branch();
		b.setBid(100);
		b.setBloc("Bangalore");
		
		Employee emp1 = new Employee();
		emp1.setEmpid(200);
		emp1.setEmpName("Amarjeeth");
		emp1.setBranch(b);
		
		Employee emp2 = new Employee();
		emp2.setEmpid(200);
		emp2.setEmpName("Amarjeeth");
		emp2.setBranch(b);
		
		Employee emp3 = new Employee();
		emp3.setEmpid(200);
		emp3.setEmpName("Amarjeeth");
		emp3.setBranch(b);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}

}
