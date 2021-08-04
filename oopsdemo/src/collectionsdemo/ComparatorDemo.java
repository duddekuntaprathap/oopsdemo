package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Developer> al=new ArrayList<Developer>();
		
		Developer d1=new Developer(181,"mike","java");
		Developer d2=new Developer(102,"ravi","angular");
		Developer d3=new Developer(163,"mary","sql");
		Developer d4=new Developer(104,"nav","uml");
		al.add(d1);
		al.add(d2);
		al.add(d3);
		al.add(d4);
		
		for(Developer s:al)
		{
			System.out.println(s);
		}
		Collections.sort(al,new IdComparator());
		System.out.println("sorting based on id");
		for(Developer s:al)
		{
			System.out.println(s);
		}
		Collections.sort(al,new DomainCom());
		System.out.println("sorting based on domain");
		for(Developer s:al)
		{
			System.out.println(s);
		}
		
	}

}
