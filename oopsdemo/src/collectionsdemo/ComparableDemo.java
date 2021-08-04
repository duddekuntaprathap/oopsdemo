package collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student(101,20,"mike");
		Student s2=new Student(102,21,"mike");
		Student s3=new Student(103,2,"mike");
		Student s4=new Student(104,23,"mike");
		Student s5=new Student(105,24,"mike");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		Collections.sort(al);
		for(Student s:al)
		{
		System.out.println(s);
		}
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(15);
		a.add(13);
		a.add(10);
		System.out.println(a);
		
		
		
	}

}
