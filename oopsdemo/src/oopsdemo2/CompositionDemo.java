package oopsdemo2;
class Honda extends Car
{
	public void hondaStart()
	{
		Engine heng=new Engine();
		heng.startEngine();
	}
}

public class CompositionDemo {

	public static void main(String[] args) {
		Honda hondaCity=new Honda();
		hondaCity.setColor("silver");
		hondaCity.setMax_speed(180);
		System.out.println("---------car details--------");
		System.out.println(hondaCity.getColor()+" color");
		System.out.println(hondaCity.getMax_speed()+" speed");
		hondaCity.hondaStart();

	}

}
