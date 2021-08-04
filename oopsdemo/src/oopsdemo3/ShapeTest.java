package oopsdemo3;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape=new Circle(11);
		System.out.println("using interface :"+shape.lable);
		shape.draw();
		System.out.println("Area of circle is "+shape.getArea());
		
		shape=new Rectangle(10,5);
		shape.draw();
		System.out.println("Area of circle is "+shape.getArea());
		

	}

}
