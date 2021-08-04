package oopsdemo2;

public class MultiLevel {

	public static void main(String[] args) {
		Director d=new Director(101,"keane",5000);
		System.out.println("----------Director details-------------");
		d.display();
		d.getHRA();
		d.getDA();
		d.getTA();
		d.getGross();
		Manager m=new Manager(201,"mary",4000);
		m.display();
		m.getDA();
		m.getHRA();
		m.getGross();
		Staff s=new Staff(301,"helen",2000);
		s.display();
		s.getHRA();
	}

}
