package collectionsdemo;

public class Student implements Comparable<Student>{
	int rollNo,age;
	String name;

	public Student(int rollNo, int age, String name) {
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		if(age==o.age) {
		return 0;
		}
		else if(age>o.age)  //age<o.age  for reverse
		{
			return 1;
		}
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", age=" + age + ", name=" + name + "]";
	}

}
