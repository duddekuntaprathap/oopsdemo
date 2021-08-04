package oopsdemo2;

public class Staff 
{
	int empid;
	String name;
	double sal,hra;
	public Staff(int empid, String name, double sal) 
	{
		this.empid = empid;
		this.name = name;
		this.sal = sal;
	}
	void getHRA()
	{
		hra=(sal*60)/100;
		System.out.println("HRA :"+hra);
	}
	void display()
	{
	
		System.out.println(empid+" "+name+" "+sal);
	}
}
class Manager extends Staff
{
	double da,gross;
	public Manager(int empid, String name, double sal) {
		super(empid, name, sal);
	}
	void getDA()
	{
		da=(sal*80)/100;
		System.out.println("DA :"+da);
	}
	void getGross()
	{
		gross=(sal+hra+da);
		System.out.println("Gross salary of manager is :"+gross);
	}
}
class Director extends Manager
{
	double ta,gross;
	public Director(int empid, String name, double sal) {
		super(empid, name, sal);
	}
	void getTA()
	{
		ta=(sal*30)/100;
		System.out.println("TA :"+ta);
	}
	void getGross()
	{
		gross=(sal+hra+da+ta);
		System.out.println("Gross salary of Director is :"+gross);
	}
	
}

