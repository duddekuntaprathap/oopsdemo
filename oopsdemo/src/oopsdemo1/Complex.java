package oopsdemo1;

public class Complex {
	double real,imaginary;

	public Complex(double real, double imaginary) 
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	void add(Complex obj)
	{
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;
	}
	void display()
	{
		System.out.println(this.real+"i"+this.imaginary);
	}

}
