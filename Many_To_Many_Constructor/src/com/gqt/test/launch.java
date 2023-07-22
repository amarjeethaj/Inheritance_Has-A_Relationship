package com.gqt.test;

import com.gqt.entites.*;

public class launch {

	public static void main(String[] args) {
		Project prj1 = new Project(100, "Java", "Amar");
		Project prj2 = new Project(200, "Python", "Monish");
		Project prj3 = new Project(300, "C++", "jesh");
		
		Employee emp1 = new Employee(10, "Dilip", prj1, prj2 ,prj3);
		Employee emp2 = new Employee(20, "Rakesh", prj1,prj2);
		Employee emp3 = new Employee(30, "Rohit", prj2,prj3);
		
		emp1.disp();
		emp2.disp();
		emp3.disp();
	}

}
