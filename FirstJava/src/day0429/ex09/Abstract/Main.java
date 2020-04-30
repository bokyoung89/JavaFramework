package day0429.ex09.Abstract;

public class Main {

	public static void main(String[] args) { 
//결과값
//say()
//SayGoodbye
		
		//추상 클래스 객체 생성 불가 : 무조건 상속으로 구현해야 함.
		//Say s = new Say();
		
		//무조건 상속으로 구현
		SayHello h = new SayHello();
		h.say();
		
		SayGoodbye g = new SayGoodbye();
		g.say();
		
	}

}
