package day0429.ex03.instanceOf;

public class Manager extends Employee{
	
	public Manager(String name, String sabun) {
		super(name, sabun);
	}

	public void copy() {
		System.out.println("copy() : 복사하다.");
		
	}

}
