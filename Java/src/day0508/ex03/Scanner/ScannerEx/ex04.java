package day0508.ex03.Scanner.ScannerEx;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		//Scanner 시작
		Scanner sc = new Scanner(System.in);
		boolean whileLoop = true;
		while(whileLoop) {
			System.out.println("\n0~9 사이의 숫자를 입력하세요.");
			System.out.println("9는 프로그램 종료입니다.");
			int choice = sc.nextInt();
			
			switch(choice) {	//switch문
			case 9:
				System.out.println("종료를 선택하셨습니다.");
				whileLoop = false;
				break;	//switch 종료
			default:
				System.out.println("계속 진행을 합니다.");
				break;
			}
//			if(choice == 0) {	//if~else문
//			break;	//while()을 종료한다.
//			} else {
//			System.out.println("계속 진행을 합니다.");
//			}

		}	//end : while()
		sc.close();
		System.out.println("Scanner Closed");
	} //end : main()
}



