//04/12/24
//Task1
//1. Write a Java program to create a class called "Vehicle" with attributes for make,
//model, and year. Create subclasses "Car" and "Truck" that add specific attributes like trunk
//size for cars and payload capacity for trucks. Implement a method to display vehicle details 
//in each subclass.
package com.JavaProgram;
class Vechicle
{
	public String make;
	public String model;
	public int year;
	Vechicle(String make,String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	public String getmake()
	{
		return make;
	}
	public String getmodel()
	{
		return model;
	}
	public int getyear()
	{
		return year;
	}
}
class Car extends Vechicle
{
	public int TrunkSize;
	Car(String make, String model, int year,int TrunkSize) {
		super(make, model, year);
		this.TrunkSize=TrunkSize;		
	}
	public int getTrunkSize()
	{
		return TrunkSize;
	}
	public void displayDetails()
	{
		System.out.println("This is a "+make+" Make");
		System.out.println("This is a "+model+" Model");
		System.out.println(year+" Year Model");
		System.out.println("This is a "+TrunkSize+" litre capacity trunk");
	}
}
	class Truck extends Vechicle
	{
		public int PayLoadCapacity;
		Truck(String make, String model, int year,int PayLoadCapacity) {
			super(make, model, year);
			this.PayLoadCapacity=PayLoadCapacity;		
		}
		public int getPayLoadCapacity()
		{
			return PayLoadCapacity;
		}
		public void displayDetails1()
		{
			System.out.println("This is a "+make+" Make");
			System.out.println("This is a "+model+" Model");
			System.out.println(year+" Year Model");
			System.out.println("Maximum PayLoad Capacity is "+PayLoadCapacity+" tons");
		}
	}

public class vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car("bmw","ferrari",2011,100);
	System.out.println("Car Details:\n");
	obj.displayDetails();
	Truck obj1=new Truck("TATA","mahindra",2011,100);
	System.out.println("\nTruck Details:\n");
	obj1.displayDetails1();
	}

}


