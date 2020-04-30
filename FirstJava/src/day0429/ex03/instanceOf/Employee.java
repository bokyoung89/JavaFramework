package day0429.ex03.instanceOf;

public class Employee {
	private String name;
	private String sabun;
	
	public Employee() {
	}
	
	public Employee(String name, String sabun) {
		this.name = name;
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSabun() {
		return sabun;
	}

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	
	public void printInfo() {
		System.out.println("이름=" + name);
		System.out.println(" 사번=" + sabun);
	}
}
