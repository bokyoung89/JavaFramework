package day0506.ex7.Anonymous;

public class Person {
	
	//Variable
	private String name;
	private int age;

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
		System.out.println("=== person ===");
		System.out.println("이름=" + getName());
		System.out.println(" 나이=" + getAge());
	}
}
