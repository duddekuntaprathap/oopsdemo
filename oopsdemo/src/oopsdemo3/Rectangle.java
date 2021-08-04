package oopsdemo3;

public class Rectangle implements Shape
{
	private double width,height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("draing rectangle");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}
	
}
