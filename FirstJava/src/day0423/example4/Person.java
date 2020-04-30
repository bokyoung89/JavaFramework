package day0423.example4;

public class Person {
	//Variable
	private String name;
	private int age;
	
	//Constructor - 디폴트 생성자(입력값이 없는)
	public Person() {
		
	}
	//Constructor - name only
	public Person(String name) {
		this.name = name;
	}
	//Constructor - age only
	public Person(int age) {
		this.age = age;
	}
	//Constructor - all
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
		System.out.print("name=[" + name + "]");
		System.out.println("age=[" + age + "]");
	}

}
