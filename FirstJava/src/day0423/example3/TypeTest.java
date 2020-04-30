package day0423.example3;

public class TypeTest {

	public static void main(String[] args) {
//		byte b = 21478364;	//컴파일 에러
//		short s = 21478364;	//컴파일 에러
//		int i = 21478364;
//		long l = 21478364;
//		
//		//정수형
//		b = 1;
//		s = 10;
//		i = 100;
//		l = 1000L;
//		System.out.println(b);
//		System.out.println(s);
//		System.out.println(i);
//		System.out.println(l);
		
		//실수형
		float f = 1.1f;	//실수의 상수 표현은 무조건  double type이 디폴트 값. 따라서 뒤에 f 붙여서 구분해야 함.
		double d = 1.1d;
		System.out.println(f);
		System.out.println(d);
	}
}