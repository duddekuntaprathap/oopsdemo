package exception;

public class StringDemo {
	public static void main(String[] args) {
		String s1="Hello World";
        String s2=null;
        try {
        	System.out.println(s1.length());
        	System.out.println(s2.length());
        }
        catch(Exception e)
        {
        	System.out.println("exception occured "+e);
        }
        
	}
}
