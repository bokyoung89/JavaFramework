package day0424.IfElse;

public class Exam {

	public static void main(String[] args) {

		//홀수와 짝수를 구하는 프로그램을 작성하세요.
		int data = 10;
		
		if(data % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		int result = data % 2;
		switch (result) {
		case 0: 
			System.out.println("짝수입니다.");
			break;
			
		default:
			System.out.println("홀수입니다.");
		}
	}		

}
