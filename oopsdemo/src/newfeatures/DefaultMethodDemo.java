package newfeatures;

import java.time.LocalDate;

interface MyInterface
{
	//abstract method
	public void square(int a);
	
	//default methods
	default void display(String s)
	{
		System.out.println("Hello "+s);
	}
	
	//static method
	static void printDate()
	{
		System.out.println("todays date "+LocalDate.now());
	}
}


public class DefaultMethodDemo implements MyInterface{

	public static void main(String[] args) {
		DefaultMethodDemo d=new DefaultMethodDemo();
		d.square(6);// calling implemented method
		d.display("default method");//calling default methd
		MyInterface.printDate();//calling static method

	}

	@Override
	public void square(int a) {
		System.out.println("square of a number is "+a*a);
	}
}
