package day0506.ex6.Api;

public class String4 {

	public static void main(String[] args) {
		//int : 가변
		int num = 10;
		num = 20;
		System.out.println("num=" + num);
		
		//String : 불변
		String str1 = "Hello";
		String str2 = str1.concat(" World");	//String 객체가 새로 생성된다.
		System.out.println("str1=" + str1); //str1이 가리키는 데이터
		System.out.println("str2=" + str2); //str1이 가리키는 데이터
		
		//StringBuffer : 가변
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append("   World");
		System.out.println("buffer=" + buffer);	//buffer가
	}

}
