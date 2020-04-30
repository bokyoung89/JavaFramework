package day0429.ex09.Abstract;

public class SayHello extends Say{ //추상메소드 쓰기 싫으면 추상클래스가 되면 됨. 그러면 또다른 클래스를 써서  본 클래스를 상속받게 해야 함.
									//왠만하면 일반 클래스로 쓴다.

	public void say() { //슈퍼클래스가 추상클래스이면 상속클래스는 추상메소드 반드시 강제적으로 구현해야 한다. 아무것도 안하지만 일반 메소드.
		System.out.println("say()");
	}
}
