package day0429.ex03.instanceOf;

public class Ceo extends Employee{
	
	public Ceo(String name, String sabun) {
		super(name, sabun);
	}
	
	public void order() {
		System.out.println("order() : 일을 시키다.");
		
	}
}
