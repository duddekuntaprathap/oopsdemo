package exception;

public class CheckingAccount {
	private double bal;
	private int num;
	public CheckingAccount(int num) {
		this.num = num;
	}
	public double getBal() {
		return bal;
	}
	public int getNum() {
		return num;
	}
	public void deposit(double amt)
	{
		bal+=amt;
	}
	public void withdraw(double amt) throws InsufficientFunds {
        if(amt <= bal) {
           bal -= amt;
        }else {
           double needs = amt - bal;
           throw new InsufficientFunds(needs);
        }
     }

}
