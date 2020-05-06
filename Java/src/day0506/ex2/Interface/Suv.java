package day0506.ex2.Interface;

public class Suv extends Car implements PassangerModel, TruckModel  {

	public Suv(String name) {
		super(name);
	}
	
	public void getOn() {
		System.out.println(getName() + "에 타다.");
	}
	
	public void getOff() {
		System.out.println(getName() + "에 내리다.");
	}
	
	public void load() {
		System.out.println(getName() + "에 짐을 싣다.");
	}
	
	public void unload() {
		System.out.println(getName() + "에 짐을 내리다.");
	}
}
