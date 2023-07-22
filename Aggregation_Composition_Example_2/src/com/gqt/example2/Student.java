package com.gqt.example2;

public class Student {
	Heart h = new Heart(250, 100);
	Brain b = new Brain("Red", 300);
	Bike bike;
	Book book;
	public void setbike(Bike bike)
	{
		this.bike=bike;
	}
	public void setbook(Book book)
	{
		this.book=book;
	}
}
