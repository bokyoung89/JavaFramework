package day0506.ex6.Api;

public class Wrapper {

	public static void main(String[] args) {
		/* Wrapper 클래스
		* 1. 자바의 기본 자료형을 객체로 표현한 8개의 클래스
		* 2. 기본 데이터 형을 객체와 할 때 사용
		* 3. 기본 데이터 타입을 객체화 하는 방법
		* 	1) int a = 5;
		* 	2) Integer I = new Integer(a);
		* 4. Wrapper class에서 기본 데이터 형으로 변환
		* 	1) int b = i.intValue();
		*/
		
		// ### 연산 ###
		// ====== Integer <---> int, String ======
		System.out.println("====== Integer <---> int, String ===");
		
		Integer integer = new Integer(5);	//Integer
		
		int int1 = integer.intValue();	//
		String string1 = integer.toString();	//Integer --> String
		System.out.println("int1=" + int1);
		System.out.println("String1=" + string1);
		
		// ====== String <---> int ======
		System.out.println("====== String <---> int ======");
		
		String string2 = new String("10");	//String
		
		int int2 = integer.parseInt(string2);	//String --> int
		String string3 = integer.toString(int2);	//int --> String
		System.out.println("int2=" + int2);
		System.out.println("string3=" + string3);
		
		// ### AutoBoxing, AutoUnBoxing ###
		// JDK 1.5 버전 이후 지원
		
		// ====== AutoBoxing ======
		//Boxing : 기본 자료형을  Wrapper 클래스 객체로 변경하는 것
		//AutoBoxing : Boxing을 자동으로 진행
		
		Integer wrapper1 = new Integer(30);	//Boxing
		Integer wrapper2 = 10;	//AutoBoxing
		
		// ====== AutoUnBoxing ======
		//UnBoxing : Wrapper 클래스 객체를 기본 자료형으로 변경하는 것
		//AutoUnBoxing : UnBoxing을 자동으로 진행
		
		int value1 = wrapper1.intValue();	//UnBoxing
		int value2 = wrapper1;	//AutoUnBoxing

	}

}
