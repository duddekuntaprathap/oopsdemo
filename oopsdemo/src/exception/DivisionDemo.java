package exception;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		int a,b,result;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try
		{
			result=a/b;
			System.out.println("result="+result);
		}
		catch(Exception e)
		{
			System.out.println("Divide by zero error");
		}
		finally
		{
			sc.close();  
			System.out.println("program ended normally");
		}
	}
}
