package day0508.ex03.Scanner.ScannerEx;

import java.util.Scanner;

public class ex06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.등록");
		System.out.println("9.종료");
		System.out.println("메뉴를 선택하세요=>");	
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("[등록]");
			System.out.println("이름을 입력하세요=>");
			System.out.println("나이를 입력하세요=>");
			String name = sc.next();
			int age = sc.nextInt();
			System.out.println("계속 진행합니다.");
		}
	}
}
