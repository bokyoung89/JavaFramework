package day0429.ex04.collection;

public class Student extends Person{
	
	private String hakbun;	//학번
	
	public Student() {
	}
	
	public Student(String name, int age, String hakhun) {
		super(name, age);
		this.hakbun=hakhun;
		
		System.out.println(name +"." + age + "." + hakbun);
	}
	
	public String getHakbun() {
		return hakbun;
	}
	
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	
	//Method overriding
	//Override하지 않으면  person 클래스의 printinfo가 출력
	public void printInfo() {
		System.out.print("이름=" + getName()); //public한 
		System.out.print(" 나이=" + getAge());
		System.out.println(" 학번=" + getHakbun());
	}
}
