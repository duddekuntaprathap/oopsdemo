package oopsdemo2;

public class Doctor 
{
	int idNo;
	String name,address;
	public Doctor(int idNo, String name, String address) 
	{
		this.idNo = idNo;
		this.name = name;
		address = address;
	}
	void display()
	{
		System.out.println("---------Doctor Details---------");
		System.out.println("the name is "+name);
		System.out.println("the number is "+idNo);
		System.out.println("the address is "+address);
	}
	
}
