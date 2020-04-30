package day0428.MethodOverriding.exam.aniamlOverride;

public class Animal {
	
	String animalName;
	int age;
	String gender;
	
	public Animal(String animalName, int age, String gender) {
		this.animalName = animalName;
		this.age = age;
		this.gender = gender;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}	
	
	public void printInfo() {
		System.out.println("====== Animal =======");
		System.out.println("동물=" + animalName);
		System.out.println("나이=" + age);
		System.out.println("성별=" + gender);
	}

}
