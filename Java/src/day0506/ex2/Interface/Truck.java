package day0506.ex2.Interface;

public class Truck extends Car implements TruckModel{
	
	public Truck(String name) {
		super(name);
	}

	public void load() {
		System.out.println(getName() + "에 짐을 싣다.");
	}
	
	public void unload() {
		System.out.println(getName() + "에서 짐을 내리다.");
	}

}
