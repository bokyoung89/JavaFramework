package day0508.ex03.Scanner.ScannerEx;

import java.util.Scanner;

public class ex01scanner {

	public static void main(String[] args) {
		
		//Scanner 시작
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메시지를 입력하세요.");
		String stringLineValue = sc.nextLine();
		System.out.println("입력=" + stringLineValue);
		
		System.out.println("정수를 입력하세요.");
		int intValue = sc.nextInt();
		System.out.println("입력=" + intValue);
		
		System.out.println("실수를 입력하세요.");
		float floatValue = sc.nextFloat();
		System.out.println("입력=" + floatValue);
		
		System.out.println("문자를 입력하세요.");
		String stringValue = sc.next();
		System.out.println("입력=" + stringValue);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int intValue1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int intValue2 = sc.nextInt();
		
		int plusResult = intValue1 + intValue2;
		System.out.print(intValue1 + " + "+ intValue2 + " = ");
		System.out.println(plusResult);
		
		//Scanner 종료
		sc.close();
		System.out.println("Scanner Closed");
		
	}

}
