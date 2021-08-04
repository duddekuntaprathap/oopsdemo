package oopsdemo3;

public class Manager extends Employee{
	public Manager(String name, double basic, String address,String dept) {
		super(name, basic, address);
		this.dept=dept;
		// TODO Auto-generated constructor stub
	}

	String dept;
	void show()
	{
		super.show();
		System.out.println("dept :\t\t"+dept);
	}
	@Override
	double totalpay()
	{
		double totalAmount = 0; 
		double houseRentAllowance = (basic * 0.08);
		double dearnessAllowance = (basic * 0.3);
		double medicalAllowance = 1500; 
		totalAmount = basic + houseRentAllowance + dearnessAllowance + medicalAllowance;
		return totalAmount;
	}
}
