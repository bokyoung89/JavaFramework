package day0506.ex5.Interface;

public class SuperMan extends Human implements Flyer{
	
	public SuperMan(int age, String name) {
		super(age, name);
	}
	
	public void eat() {
		System.out.println("SuperMan.eat()");
	}

	public void takeoff() {
		System.out.println("SuperMan.takeoff()");
	}

	public void land() {
		System.out.println("SuperMan.land()");
	}

	public void fly() {
		System.out.println("SuperMan.fly()");
	}
}