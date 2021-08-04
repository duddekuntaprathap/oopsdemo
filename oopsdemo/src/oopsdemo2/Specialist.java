package oopsdemo2;

public class Specialist extends Doctor
{
	String speciality;
	public Specialist(int idNo, String name, String address ,String speciality) {
		super(idNo, name, address);
		this.speciality=speciality;
		
	}	
	void display()
	{
		super.display();
		System.out.println("the speciality is "+speciality);
	}
}
