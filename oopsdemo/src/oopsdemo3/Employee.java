package oopsdemo3;

abstract public class Employee {
String name;
double basic;
String address;
public Employee(String name, double basic, String address) {
	this.name = name;
	this.basic = basic;
	this.address = address;
}
void show() {
	System.out.println("name:\t\t\t"+name);
	System.out.println("Address:\t\t\t"+address);
	System.out.println("Basic:\t\t\t"+basic);
}
double deduction(int leave)
{
	double lesspay;
	if(leave<=5)
	{
		lesspay=(.25*basic);
	}
	else
	{
		lesspay=(.5*basic);
	}
	return lesspay;
}
abstract double totalpay();
}
