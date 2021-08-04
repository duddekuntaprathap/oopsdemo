package oopsdemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		Address ad1=new Address("Bng","ka","india",560036);
		Address ad2=new Address("hyd","ts","india",510036);
		Student s1=new Student(101,"kkk",ad1);
		Student s2=new Student(102,"lll",ad2);
		s1.display();
		s2.display();
	}

}
