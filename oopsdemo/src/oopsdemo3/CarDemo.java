package oopsdemo3;

public class CarDemo {

	public static void main(String[] args) {
		System.out.println("car details of Maruthi");
		Maruthi m=new Maruthi();
		m.CarFeatures();
		m.isAutomatic();
		m.highTechAC();
		m.modelName();
		System.out.println("-----------------------");
		Audi a=new Audi();
		a.CarFeatures();
		a.isAutomatic();
		a.highTechAC();
		m.modelName();

	}

}
