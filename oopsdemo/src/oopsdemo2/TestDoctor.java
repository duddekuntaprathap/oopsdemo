package oopsdemo2;

public class TestDoctor 
{
	public static void main(String[] args) 
	{
		NonSpecialist ns=new NonSpecialist(101,"prathap","hyd");
		ns.display();
		Specialist sp=new Specialist(102,"prathap","bng","cordiologist");
		sp.display();
	}

}
