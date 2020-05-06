package day0506.ex5.Interface;

public class Human extends Animal {
	
	int age;
	String name;
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Human.eat()");
	}
	
	
}
