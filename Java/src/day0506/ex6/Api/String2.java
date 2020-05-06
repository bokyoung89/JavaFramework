package day0506.ex6.Api;

public class String2 {

	public static void main(String[] args) {
		
		int val1 = 1;
		int val2 = 2;
		int val3 = 3;
		
		String s1 = "A"; //정수 연산 먼저한 다음 문자 더하기.
		String s2 = "B";
		
		System.out.println((val1 + val2 + val3) + s1 + s2);	//소괄호를 써서 원하는 결과값을 명확히 인지시켜줄 것
		System.out.println(s1 + s2 + (val1 + val2 + val3));

	}

}
