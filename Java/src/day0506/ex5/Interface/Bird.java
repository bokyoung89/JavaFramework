package day0506.ex5.Interface;

public class Bird extends Animal implements Flyer{
	
	int age;
	int wing;
	
	public Bird(int age, int wing) {
		this.age = age;
		this.wing = wing;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	public void eat() {
		System.out.println("Animal.eat()");
	}

	public void takeoff() {
		System.out.println("Bird.takeoff()");	
	}

	public void land() {
		System.out.println("Bird.land()");		
	}

	public void fly() {
		System.out.println("Bird.fly()");		
	}
}
