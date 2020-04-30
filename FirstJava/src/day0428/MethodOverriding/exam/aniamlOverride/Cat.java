package day0428.MethodOverriding.exam.aniamlOverride;

public class Cat extends Animal {
	
	private int leg;
	
	public Cat(String animalName, int age, String gender, int leg) {
		super(animalName, age, gender);
		this.leg = leg;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}
	
	public void printInfo() {
		System.out.println("====== Cat =======");
		System.out.println("동물=" + getAnimalName());
		System.out.println("나이=" + getAge());
		System.out.println("성별=" + getGender());
		System.out.println("다리수=" + leg);
	}
	public void run() {
		System.out.println(getAnimalName() + "::run()");
	}
}
