package oopsdemo3;

abstract public class Traunee {
	private String name,address;
	private int no;
	public Traunee(String name, String address, int no) {
		this.name = name;
		this.address = address;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public abstract double calculateMarks();
	void show()
	{
		System.out.println("display marks for "+this.name+" "+this.address);
	}
	@Override
	public String toString() {
		return "Traunee [name=" + name + ", address=" + address + ", no=" + no + "]";
	}
	

}
