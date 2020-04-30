package day0429.ex08.Abstract;

public abstract class Person {	//추상클래스. 일종의 표준 역할. 상속받아서 그대로 쓴다...
//public class Person{
	
	private String name;
	private int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printInfo() {
		System.out.print("이름=" + name);
		System.out.println(" 나이=" + age);
	}
}
