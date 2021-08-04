package exception;

public class InsufficientFunds extends Exception{
	private double amt;

	public InsufficientFunds(double amt) {
		this.amt = amt;
	}

	public double getAmt() {
		return amt;
	}
	
	
}
