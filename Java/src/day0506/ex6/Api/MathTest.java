package day0506.ex6.Api;

public class MathTest {

	public static void main(String[] args) {
		
		//Math.random()
		//0~1 double value
		//0.0 <= double < 1
		double random = Math.random();
		System.out.println("random=" + random);               
		
		//0~9 int value
		int randomint1 = (int) (random * 10);
		System.out.println("randomint1=" + randomint1);
		
		//0~99 int value
		int randomint2 = (int) (random * 100);
		System.out.println("randomint2=" + randomint2);
	}
}
