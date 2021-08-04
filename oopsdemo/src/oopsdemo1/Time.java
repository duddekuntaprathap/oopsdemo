package oopsdemo1;

public class Time 
{
	int sec;
	int min;
	int hrs;
	public Time(int sec, int min, int hrs) {
		this.sec = sec;
		this.min = min;
		this.hrs = hrs;
	}
	void add(Time obj)
	{
		this.sec+=obj.sec;
		this.min+=obj.min;
		this.hrs+=obj.hrs;
		if(this.sec>=60)
		{
			this.min+=1;
			this.sec=this.sec-60;
		}
		if(this.min>=60)
		{
			this.hrs+=1;
			this.min=this.min-60;
		}
	}
	void display()
	{
		System.out.println("After Adding 2 timings");
		System.out.println(this.hrs+":"+this.min+":"+this.sec);
	}
}
