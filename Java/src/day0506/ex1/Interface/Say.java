package day0506.ex1.Interface;

public class Say implements Hello, Welcome, GoodBye{
	
	public void sayHello() {
		System.out.println("sayHello()");
	}
	
	public void sayWelcome() {
		System.out.println("sayWelcome()");
	}
	
	public void sayGoodBye() {
		System.out.println("sayGoodBye()");
	}
}
