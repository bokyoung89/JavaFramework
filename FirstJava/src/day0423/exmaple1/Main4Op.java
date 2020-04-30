package day0423.exmaple1;

public class Main4Op {

	public static void main(String[] args) {
		
		int value1 = 10;
		int value2 = 6;
		
		//덧셈
		int result1 = value1 + value2;
		System.out.println(value1 + "+" + value2 + "=" + result1);
		
		//뺄셈
		int result2 = value1 - value2;
		System.out.println(value1 + "-" + value2 + "=" + result2);
		
		//곱하기
		int result3 = value1 * value2;
		System.out.println(value1 + "*" + value2 + "=" + result3);
		
		//나눗셈의 몫
		int result4 = value1 / value2;
		System.out.println(value1 + "/" + value2 + "=" + result4);
		
		//나눗셈의 나머지
		int result5 = value1 % value2;
		System.out.println(value1 + "%" + value2 + "=" + result5);

	}

}
