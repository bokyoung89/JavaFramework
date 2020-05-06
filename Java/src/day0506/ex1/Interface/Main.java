package day0506.ex1.Interface;

public class Main {

	public static void main(String[] args) {
		
		//#### 클래스 생성 ####
		//Hello, Welcome, GoodBye : 인터페이스
		//Hello 메소드 : sayHello()
		//Welcome 메소드 : sayWelcome()
		//GoodBye 메소드 : sayGoodBye()
		//Say <-- Hello, Welcome, GoodBye
		
		Say mc = new Say();
		mc.sayHello();
		mc.sayWelcome();
		mc.sayGoodBye();
	}
}
