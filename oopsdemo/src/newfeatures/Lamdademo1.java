package newfeatures;

public class Lamdademo1 {

	interface MathOperation {
	    int operation(int a, int b);
	 }
	   
	 interface GreetingService {
	    void sayMessage(String message);
	 }
	 
	 
	public static void main(String[] args) {
		//with type declaration
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println(addition.operation(2, 1));
 

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println(subtraction.operation(2, 1));
 

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };
        System.out.println(multiplication.operation(2, 1));
 

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;
        System.out.println(division.operation(2, 2));
        
      //without parenthesis
        GreetingService greetService1 = message ->
        System.out.println("Hello " + message);
         
        //with parenthesis
        GreetingService greetService2 = (message) ->
        System.out.println("Hello " + message);
         
        greetService1.sayMessage("Mike");
        greetService2.sayMessage("John");
	}
}
