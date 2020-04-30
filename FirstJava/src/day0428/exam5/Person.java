package day0428.exam5;

public class Person {
	
	//Variable
	private String name;
	private int age;
	
	public Person() {
		System.out.println("Person.생성자()");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("Person.생성자(String name)");
	}
	
	public Person(int age) {
		this.age = age;
		System.out.println("Person.생성자(int age)");
	}
	
	public Person(String name, int age) {
		this(name); //해당 클래스 생성자에 접근 this() 1st line in constructors
		this.age = age;	//변수, 메소드 접근
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
