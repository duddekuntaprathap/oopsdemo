package oopsdemo3;

public abstract class Bike {
	Bike()
	{
		System.out.println("bike is created");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("Gear changed");
	}
}
class Honda extends Bike
{
	@Override
	void run()
	{
		System.out.println("Honda bike running");
	}
}
