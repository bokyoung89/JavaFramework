package day0428.MethodOverriding.exam;

public class Eagle extends Animal {
	
	private int wing;

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	public void run() {
		System.out.println(getAnimalName() + "::fly()");
	}

}
