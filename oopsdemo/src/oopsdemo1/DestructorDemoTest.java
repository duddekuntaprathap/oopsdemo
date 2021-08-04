package oopsdemo1;

public class DestructorDemoTest {
	@Override
	public void finalize()
	{
		System.out.println("object destroyed & garbage collected");
	}

	

}
