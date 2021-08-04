package collectionsdemo;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
	List<Book> b=new ArrayList<Book>();
	
	
	//Creating 
	Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8); 
	Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4); 
	Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	
	b.add(b1);
	b.add(b2);
	b.add(b3);
	System.out.println("----------- book details-------");
	for(Book i:b)
	{
		System.out.println(i.id+" "+i.author+" "+i.publisher+" "+i.quantity);
	}
	System.out.println("Total no. of books :"+b.size());

	
	
	}

}
