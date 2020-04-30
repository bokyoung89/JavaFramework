package day0429.ex11.Interface;

public class Main {

	public static void main(String[] args) {
		
		//======== Error =========
		//인터페이스는 객체 생성 불가(추상 클래스와 동일)
		//MyInterface i = new MyInterface();
		
		//======== 정상 실행 =========
		Class c = new Class();
		c.printInfo();
	}

}
