package day0508.ex03.Scanner.Person;

import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 등록");
		System.out.println("9. 종료");
		System.out.println("메뉴를 선택하세요=>");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("[등록]");
			System.out.println("이름을 입력하세요.");
			System.out.println("나이를 입력하세요.");
			String inputName = sc.next();
			int inputAge = sc.nextInt();
			Person p = new Person(inputName, inputAge);
			p.printInfo();
			System.out.println("계속 진행을 합니다.");
			break;
		case 9:
			System.out.println("[종료]");
			System.out.println("프로그램을 종료합니다.");
		}
		sc.close();
		System.out.println("Scanner Closed");
	}
}
