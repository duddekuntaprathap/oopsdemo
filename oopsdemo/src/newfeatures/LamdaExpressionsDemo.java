package newfeatures;

@FunctionalInterface
interface MyFnctionalInterfce
{
	public String sayHello();
}
@FunctionalInterface
interface MyFnctionalInterfce1
{
	public int incrementbyFive(int a);
}
@FunctionalInterface
interface StringConcat
{
	public String sconcat(String a,String b);
}


public class LamdaExpressionsDemo {

	public static void main(String[] args) {
		
		//lamda expression with no parameter
		MyFnctionalInterfce msg=()->{ return "hello from lamda expression";};
		System.out.println(msg.sayHello());
		
		//lamda expression with single parameter
		
		MyFnctionalInterfce1 f=(num)->num+5;
		System.out.println(f.incrementbyFive(5));
		
		//lamda expression with multiple parameter
		StringConcat sc=(s1,s2)->s1+" "+s2;
		System.out.println(sc.sconcat("hello", "hi"));
		
		
		
	}

}
