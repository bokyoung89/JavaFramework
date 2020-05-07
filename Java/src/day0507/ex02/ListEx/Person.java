package day0507.ex02.ListEx;

public class Person {
	
	//Variable
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
