package collectionsdemo;

import java.util.*;

public class HashSetDemoUserDefined {

	public static void main(String[] args) {
		Set<Customer> c=new HashSet<Customer>();
		c.add(new Customer(1000001,"prathap","bng"));
		c.add(new Customer(1000002,"mahesh","hyd"));
		c.add(new Customer(1000003,"anil","mumbai"));
		c.add(new Customer(1000004,"ram","chennai"));
		
		/*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */

		c.add(new Customer(1000004,"ram","chennai"));
		
		for(Customer i:c)
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
		}
	}

}
