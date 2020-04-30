package day0428.exam7;

public class Student extends Person{
	
	private String hakbun;	
	
	public Student(String name, int age, String hakhun) {
	
		super(name, age);
		this.hakbun = hakbun;
	}

	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	
	public void printInfo() {
		System.out.println("=== student ===");
		System.out.print("이름=" + getName());
		System.out.print(" 나이=" + getAge());
		System.out.println(" 학번=" + hakbun);
	}
}
