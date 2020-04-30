package day0428.MethodOverriding.exam.aniamlOverride;

public class MainAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal("동물", 0, "male");
		a1.printInfo();
		
		Cat c1 = new Cat("고양이", 3, "female", 3);
		System.out.println();
		c1.printInfo();
		c1.run();
		
		Eagle e1 = new Eagle("독수리", 1, "female", 2);
		System.out.println();
		e1.printInfo();
		e1.fly();	
	}

}
