package com.gqt.example2;

public class Launch {

	public static void main(String[] args) {
		Student s = new Student();
		Bike bi = new Bike("KTM", 20);
		Book bo = new Book("Ravi","C++");
		
		System.out.println("HEART BEAR: "+s.h.getHeartBeat());
		System.out.println("Heart Weight: "+s.h.getHwaight());
		System.out.println();
		System.out.println("Brain Colour: "+s.b.getColour());
		System.out.println("Brain Weight: "+s.b.getBweight());
		System.out.println();
		System.out.println("Bike Brand: "+bi.getBrand());
		System.out.println("Bike Mileage: "+bi.getMileage());
		System.out.println();
		System.out.println(bo.getAuthor());
		System.out.println(bo.getTitle());

	}

}
