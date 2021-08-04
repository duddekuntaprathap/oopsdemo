package oopsdemo3;

import java.util.Scanner;

public class Calculator implements IMath {
	Scanner kb;
	public void add() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	public void sub() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a-b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	public void mul() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a*b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);

	}

	public void div() {
		kb = new Scanner(System.in);
        System.out.println("Enter any two integer values to perform addition");
        int a=kb.nextInt();
        int b=kb.nextInt();
        int s=a/b;
        System.out.println("Sum of "+a+" and "+b+" is "+s);

	}
	void display()
	{
		System.out.println("calculator design");
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}

}
