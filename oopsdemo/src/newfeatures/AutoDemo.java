package newfeatures;

class Auto
{
	public Auto(String year,String make,String model,String ...option)
	{
		System.out.println(year);
		System.out.println(make);
		System.out.println(model);
		System.out.println("********features*********");
		for(String i:option)
		{
			System.out.print(i);
		}
		System.out.println();
	}
}
public class AutoDemo {

	public static void main(String[] args) {
		Auto a1=new Auto("1969","Fiat","124    Spider", "5-speed",    "disk    brakes");
	       
        Auto a2=new Auto("1997","Ford","Expedition", "Automatic","Four-wheel    drive","power    windows", "power    locks","air-conditioning",
                "stereo    with    cd    changer","tinted    glass");

	}

}
