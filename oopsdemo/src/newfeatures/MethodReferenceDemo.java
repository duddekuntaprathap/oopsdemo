package newfeatures;
interface Hello
{
	void welcome();
}

public class MethodReferenceDemo {
	public static void display()
	{
		System.out.println("hello from method reference");
	}
	public void print()
	{
		System.out.println("instance");
	}
	MethodReferenceDemo()
	{
		System.out.println("in constructor");
	}

	public static void main(String[] args) {
		
		Hello h=MethodReferenceDemo::display;//invoke static method
		h.welcome();
		MethodReferenceDemo m=new MethodReferenceDemo();
		Hello h1=m::print;
		h1.welcome();
		
		Hello h2=MethodReferenceDemo::new;
		h2.welcome();
	}

}
