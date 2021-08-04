package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LamdaInCollection {

	public static void main(String[] args) {
		List<String> features =Arrays.asList("Lamdas","Default methods","Stream API","Date and time API");


		/*Java provides a new method forEach() to iterate the elements.
		 * It is defined in Iterable and Stream interface.
		 * It is a default method defined in the Iterable interface.
		 * Collection classes which extends Iterable interface can use forEach loop
		 * to iterate elements.
		 */
		features.forEach(n-> System.out.println(n));	
		
		List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        System.out.println("------------Iterating by passing lambda expression--------------");
        
        gamesList.forEach(games-> System.out.println(games) );
        
        System.out.println("----------using foreach order--------------");
        gamesList.stream().forEachOrdered(games-> System.out.println(games) );
        
        System.out.println("----------using method reference operator ::--------------");
        /*// Even better use Method reference feature of Java 8
        // method reference is denoted by :: (double colon) operator
        // looks similar to scope resolution operator of C++
         * */
        features.forEach(System.out::println);
        
        
        
        
        
        
        
        
	}

}
