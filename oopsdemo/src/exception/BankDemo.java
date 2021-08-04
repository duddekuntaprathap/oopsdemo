package exception;

public class BankDemo {
	public static void main(String[] args) {
		CheckingAccount ck=new CheckingAccount(101);
		ck.deposit(5000);
		System.out.println("5000 deposited");
		try
		{
			System.out.println("withdrwing ---");
			ck.withdraw(2000);
			ck.withdraw(4000);
		}
		catch(InsufficientFunds e)
		{
			System.out.println("insufficient amount "+ck.getBal());
			e.printStackTrace();
		}
	}
}
