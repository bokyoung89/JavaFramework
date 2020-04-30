package day0428.MethodOverriding.exam;

public class MainAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.setAnimalName("동물");
		a1.setAge(1);
		a1.setGender("male");
		System.out.println("====== Animal =======");
		System.out.println("동물=" + a1.getAnimalName());
		System.out.println("나이=" + a1.getAge());
		System.out.println("성별=" + a1.getGender());
		
		Cat c1 = new Cat();
		c1.setAnimalName("고양이");
		c1.setAge(3);
		c1.setGender("female");
		c1.setLeg(4);
		System.out.println("====== Cat =======");
		System.out.println("동물=" + c1.getAnimalName());
		System.out.println("나이=" + c1.getAge());
		System.out.println("성별=" + c1.getGender());
		System.out.println("다리수=" + c1.getLeg());
		c1.run();
		
		Eagle e1 = new Eagle();
		e1.setAnimalName("독수리");
		e1.setAge(1);
		e1.setGender("female");
		e1.setWing(2);
		System.out.println("====== Eagle =======");
		System.out.println("동물=" + e1.getAnimalName());
		System.out.println("나이=" + e1.getAge());
		System.out.println("성별=" + e1.getGender());
		System.out.println("날개수=" + e1.getWing());
		e1.run();
		
	}

}
