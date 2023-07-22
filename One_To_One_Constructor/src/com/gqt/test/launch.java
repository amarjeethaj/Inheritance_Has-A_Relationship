package com.gqt.test;

import com.gqt.entities.*;

public class launch {

	public static void main(String[] args) {
		
		Account a = new Account(1234, "Saving", "Amar");
		Employee e = new Employee(001, "amar", "Bangalore", a);
		e.disp();

	}

}
