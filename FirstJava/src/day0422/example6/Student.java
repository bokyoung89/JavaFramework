package day0422.example6;

public class Student {
	
	private String name;	//이름
	private int age;	//나이
	private String hakbun;	//학번
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getHakbun() {
		return hakbun;
	}
	
	public void printInfo() {
		System.out.println("Student Information -----");
		System.out.print("Name=[" + getName() + "]"); 
		System.out.print("Age=[" + getAge() + "]");
		System.out.println("Hakbun=[" + getHakbun() + "]");
	}
}
