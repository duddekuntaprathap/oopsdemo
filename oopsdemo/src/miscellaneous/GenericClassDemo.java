package miscellaneous;
class Sample<T>
{
	private T data;

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}	
}

public class GenericClassDemo {

	public static void main(String[] args) {
		Sample<String> s=new Sample<String>("java generics");
		System.out.println("display from generic class by passing string object "+s.getData());
		
		Sample<Integer> s1=new Sample<Integer>(10);
		System.out.println("display from generic class by passing Integer object "+s1.getData());
		
		Sample<Double> s2=new Sample<Double>(10.11);
		System.out.println("display from generic class by passing Double object "+s2.getData());
		
		Sample<Float> s3=new Sample<Float>(10.12f);
		System.out.println("display from generic class by passing Float object "+s3.getData());
		
	}

}
