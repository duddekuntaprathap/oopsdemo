package collectionsdemo;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		s.push("hello");
		s.push("hi");
		s.push("bye");
		s.push("hey");
		s.push("see you");
		System.out.println(s.pop()+" is removed ");
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("elements on top :"+s.peek());
		System.out.println("search hi :"+s.search("hi"));
	}

}
