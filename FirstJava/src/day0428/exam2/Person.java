package day0428.exam2;

public class Person {
	
	//Variable
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person.생성자()");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person.생성자(String name, int age)");
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
}
