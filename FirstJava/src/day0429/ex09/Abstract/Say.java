package day0429.ex09.Abstract;

public abstract class Say {	//추상클래스 : 객체 만들 수 없고 상속 통해서만 구현
	int age;
	public abstract void say(); 	//추상메소드 : 메소드가 abstract면 반드시 클래스도 abstract이다. {구현부}가 없고 세미콜론으로 끝난다.
									//이름만 호출하고 끝.
	public void message() {
		System.out.println("!!!!"); //다른 일반 메소드를 만들 수 있으나, 하나라도  추상 메소드면 추상 클래스가 된다. 
	}
	
	

}
