package day0507.ex10.Exception;

public class TryCatchEx {

	public static void main(String[] args) {
		int firstValue = 10;
		int secondValue = 0;
		System.out.println("firstValue=[" + firstValue + "]");
		System.out.println("secondValue=[" + secondValue + "]");
		//상황에 따라 더 쪼갤 수도 합할 수도.
		try {
			int result = firstValue / secondValue;
			System.out.println("result=[" + result + "]");
		} catch(ArithmeticException e) {
			System.out.println("========== catch ==========");
		} finally {
			System.out.println("========== finally() ==========");	
			}
		}
		
	}