package day0506.ex2.Interface;

public class Sedan extends Car implements PassangerModel{
	
	public Sedan(String name) {
		super(name);
	}

	public void getOn() {
		System.out.println(getName() + "에 타다.");
	}
	
	public void getOff() {
		System.out.println(getName() + "에 내리다.");
	}

}
