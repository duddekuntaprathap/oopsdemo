package exception;

public class Validation {
	public void validationTest(double amt,double withdraw) 
	{
		if(amt>withdraw)
		{
			System.out.println("transation successfull!!");
		}
		else
		{
			try {
			throw new InsufficientBalence("low balence");
			}
			catch(Exception e)
			{
				System.out.println(((InsufficientBalence) e).getMsg());
			}
		}
		}

}
