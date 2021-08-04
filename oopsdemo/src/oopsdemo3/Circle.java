package oopsdemo3;

public class Circle implements Shape {
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public void draw() {
		System.out.println("draing circle");

	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.r;
	}

	public double getRadius() {
		return r;
	}
	

}
