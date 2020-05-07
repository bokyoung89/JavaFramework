package day0507.ex10.Exception;

public class TryCatch {

	public static void main(String[] args) {
		// ### 예외 처리 ###
		
		// 문제 발생
		// 배열의 크기는 2개인데 인덱스 2번 공간에 접근하려 함
//		String[] stringArray = {"A", "B"};
//		int index = 0;
//		int max = 3;
//		while(index < max) {
//			System.out.println("index=[" + index + "]");
//			System.out.println("|값=" + stringArray[index]); //java.lang.ArrayIndexOut()
//			index++;
//		}
//		
		// 문제 해결
		String[] stringArray = {"A", "B"};
		int index = 0;
		int max = 3;
		while(index < max) {
			try {	//에러가 발생할 소지가 있는 코드. 문제가 발생하면 api 클래스를 찾아서 내부적으로 객체를 만들어낸다. 그리고  catch 프로그램으로 던져서 처리. 에러 메시지를 보고 API를 확인한다.
			System.out.print("index=[" + index + "]");
			System.out.println("|값=" + stringArray[index]); //java.lang.ArrayIndexOut()
			index++;
			System.out.println("========= try =========");
		} catch(IndexOutOfBoundsException e) {	
			//에러가 나면 catch 구문 실행. 에러 해결하고 정상적으로 프로그램이 계속 진행될 수 있게 만들어준다.
			System.out.println("========== catch ==========");
			index++;
			System.exit(0);		//강제로 시스템 빠져나면 finally 실행 안 됨.
		} finally {
			System.out.println("========== finally() ==========");	
			//finally는 에러와 상관없이 항상 실행. 예를 들어 데이터베이스에서 커넥션 끊을 때도 사용
			//실행 안 되는 경우 ex) System.exit(0)
		}
	}
		System.out.println("========== main() ==========");
	}
}
