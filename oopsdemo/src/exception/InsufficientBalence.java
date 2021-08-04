package exception;

public class InsufficientBalence extends RuntimeException{
	String msg;
	public InsufficientBalence(String msg)
	{
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
	

}
