package com.gqt.test;

import com.gqt.entities.*;

public class launch {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "Amar");
		Employee emp2 = new Employee(002, "Jesh");
		Employee emp3 = new Employee(003, "Monish");
		
		Employee [] e = new Employee[3];
		e[0]=emp1;
		e[1]=emp2;
		e[2]=emp3;
		
		Department d = new Department(12, "CSE", "Bangalore", e);
		d.display();
	}

}
