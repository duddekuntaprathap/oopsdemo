package miscellaneous;

import java.util.Scanner;

public class TwoPairDemo {

	public static void main(String[] args) {
		Pair<String,Integer> p=new Pair<String,Integer>("the car guy",8);
		Scanner sc=new Scanner(System.in);
		System.out.println("our current rating for "+p.getFirst()+" is "+p.getSecond());
		System.out.println("how would rate them ?");
		int score=sc.nextInt();
		p.setSecond(score);	
		System.out.println("our new rating for "+p.getFirst()+" is "+p.getSecond());

		
		Pair<String,Float> p1=new Pair<String,Float>("money heist",8.5f);
		
		System.out.println("our current rating for "+p1.getFirst()+" is "+p1.getSecond());
		System.out.println("how would rate them ?");
		float score1=sc.nextFloat();
		p1.setSecond(score1);	
		System.out.println("our new rating for "+p1.getFirst()+" is "+p1.getSecond());

	}

}
