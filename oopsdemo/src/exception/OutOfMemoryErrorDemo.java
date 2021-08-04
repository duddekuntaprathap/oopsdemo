package exception;

import java.io.IOException;

public class OutOfMemoryErrorDemo {
	public void createArray(int size)
	{
		try {
			Integer[] a=new Integer[size];
		}
		catch(OutOfMemoryError e)
		{
			System.err.println("Arraysize too large"+e);
			System.err.println("maax JVM memory "+Runtime.getRuntime().maxMemory());
			
		}
	}
	public static void main(String[] args) {
		OutOfMemoryErrorDemo d=new OutOfMemoryErrorDemo();
		d.createArray(100000*1000000);
		
		try {
			Runtime.getRuntime().exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
