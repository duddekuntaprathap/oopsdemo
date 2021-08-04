package newfeatures;

public class ArgsDemo {

	static void fun(String s,int ...a)
	{
		System.out.println("String passed "+s);
		System.out.println("No of Arguments passed "+a.length);
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun("jdbc",100,22,33);
		fun("kd",2,4,4,66,56,2);
	}

}
