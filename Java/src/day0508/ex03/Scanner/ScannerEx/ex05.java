package day0508.ex03.Scanner.ScannerEx;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		while(menu) {	//()괄호의 값을 비교
			System.out.println("[메뉴 선택]----------" );
			System.out.println("1. 등록");
			System.out.println("9. 종료");
			System.out.print("메뉴를 선택하세요 =>");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[등록]");
				System.out.println("계속 진행합니다.");
				break;
			case 9:
				System.out.println("[종료]");
				System.out.println("프로그램을 종료합니다.");
				menu = false;
				break;
			default:
				System.out.println("잘못 선택하셨습니다.");
				System.out.println("계속 진행합니다.");
				break;
			}
		}
		sc.close();
		System.out.println("Scanner Closed");
	}
}
