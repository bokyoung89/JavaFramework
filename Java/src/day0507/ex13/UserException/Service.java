package day0507.ex13.UserException;

public class Service {

	public void method() throws MyException{
		System.out.println("\t\tService.method()::Start");
		try {
		String[] stringArray = new String[3];
		stringArray[0] = "A";
		stringArray[1] = "B";
		stringArray[2] = "C";
			for(int i=0;i<4;i++) {
				System.out.println("\t\tstringArray[" + i +"]=" + stringArray[i]);
			}		
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("\t\t---- catch : Service.method() ----");
		throw new MyException("New My Exception");	//MyException 생성
		//1. 사용자 정의 예외처리를 할 때는 무조건 throws-throw해야하는가?
		//약간.. 구문처럼?->통상적으로 많이 쓰는 느낌
	}  finally {
		System.out.println("\t\t---- finally : Service.method() ----");
	}
	}
}


