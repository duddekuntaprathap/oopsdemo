package oopsdemo1;

public class DestructorDemo {
	public static void main(String[] args) {
		DestructorDemoTest t1=new DestructorDemoTest();
		DestructorDemoTest t2=new DestructorDemoTest();
		t1=null;
		t2=null;
		System.gc();
		System.out.println("in main method");
	}
}
