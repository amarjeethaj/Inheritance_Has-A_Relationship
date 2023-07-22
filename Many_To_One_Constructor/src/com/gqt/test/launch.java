package com.gqt.test;

import com.gqt.entites.*;

public class launch {

	public static void main(String[] args) {
		Branch b = new Branch(100, "YLNK");
		
		Employee emp1 = new Employee(200, "Amar", b);
		Employee emp2 = new Employee(300, "jeeth", b);
		Employee emp3 = new Employee(400, "Monish", b);
		
		emp1.display();
		emp2.display();
		emp3.display();
	}

}
