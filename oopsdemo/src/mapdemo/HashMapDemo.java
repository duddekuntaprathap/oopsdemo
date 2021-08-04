package mapdemo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*; 

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"uml");
		hm.put(2,"sql");
		hm.put(3,"java");
		hm.put(4,"j2ee");
		hm.put(5,"spring");
		
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry mentry=(Map.Entry) itr.next();
			System.out.println(mentry.getKey()+"--->"+mentry.getValue());
		}
	}
}
