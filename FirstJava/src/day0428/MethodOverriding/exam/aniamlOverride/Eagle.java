package day0428.MethodOverriding.exam.aniamlOverride;

public class Eagle extends Animal {
	
	private int wing;
	
	public Eagle(String animalName, int age, String gender, int wing) {
		super(animalName, age, gender);
		this.wing = wing;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	public void printInfo() {
		System.out.println("====== Eagle =======");
		System.out.println("동물=" + getAnimalName());
		System.out.println("나이=" + getAge());
		System.out.println("성별=" + getGender());
		System.out.println("날개=" + wing);
	}
	public void fly() {
		System.out.println(getAnimalName() + "::fly()");
	}
}
