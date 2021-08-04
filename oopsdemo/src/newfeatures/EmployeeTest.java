package newfeatures;

import java.util.Arrays;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee[] employees= {new Employee("David"),new Employee("alex"),new Employee("john"),new Employee("richard")};

		System.out.println("Before Sorting Names: "+Arrays.toString(employees));
		
		Arrays.sort(employees,Employee::nameCompare);
		System.out.println("after sorting names :"+Arrays.toString(employees));


	}

}
