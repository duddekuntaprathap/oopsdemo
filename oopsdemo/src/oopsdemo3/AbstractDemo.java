package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {
		Traunee t=new Marks("john","bng",1001,35);
		t.show();
		double marks=t.calculateMarks();
		System.out.println(t+" "+marks);
	}

}
