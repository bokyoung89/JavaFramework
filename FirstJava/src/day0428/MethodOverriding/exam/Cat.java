package day0428.MethodOverriding.exam;

public class Cat extends Animal {
	
	private int leg;

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public void run() {
		System.out.println(getAnimalName() + "run()");
	}
}
