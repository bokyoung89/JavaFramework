package day0429.ex12.Interface;

public class Main {

	public static void main(String[] args) {
//==== 결과값 ====
//원을 그리다.
//사각형을 그리다.
//삼각형을 그리다.
		
		//=== interface ===
		//shape : 인터페이스
		//draw() : shape 내 메소드
		//shape <== Circle, Rectangle, Triangle
		
		//=== Implements Interface ===
		Circle c = new Circle();
		c.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Triangle t = new Triangle();
		t.draw();
	}
}
