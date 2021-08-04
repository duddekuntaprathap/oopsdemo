package oopsdemo1;

public class TimeTest {

	public static void main(String[] args) {
		Time t1=new Time(55,45,12);
		Time t2=new Time(30,30,10);
		t1.add(t2);
		t1.display();

	}

}
