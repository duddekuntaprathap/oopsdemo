package oopsdemo3;

public class Marks extends Traunee{
	private double marks;

	public Marks(String name, String address, int no,double marks) {
		super(name, address, no);
		this.marks=marks;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public double calculateMarks()
	{
		System.out.println("calculate marks");
		return marks*2;
	}
}
