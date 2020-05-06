package day0506.ex6.Api;

public class Equals {

	public static void main(String[] args) {
		
		//int
		int intVal1 = 10;
		int intVal2 = 10;
		System.out.println("======= int ========");
		System.out.println(intVal1 == intVal2);
		
		//String : 주소값 비교
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println("===== String ======");
		System.out.println(s1==s2); 	//주소값 비교
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		
		//String : 문자열의 경우는 값을 비교해야 정확한 결과가 나옴
		System.out.println("===== String : equals() ======");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		

	}

}
