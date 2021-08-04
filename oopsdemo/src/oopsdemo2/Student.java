package oopsdemo2;

public class Student {
	int rollno;String name;
	Address ad;
	public Student(int rollno, String name, Address ad) {
		this.rollno = rollno;
		this.name = name;
		this.ad = ad;
	}
	void display()
	{
		System.out.println("-------student details-------");
		System.out.println("Student id :"+rollno);
		System.out.println("Student name"+name);
		System.out.println("Address"+ad.city+" "+ad.state+" "+ad.country+" "+ad.pincode);
		
	}

}
