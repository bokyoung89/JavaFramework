package day0429.ex10.Interface;

public class Main {

	public static void main(String[] args) {
		
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
