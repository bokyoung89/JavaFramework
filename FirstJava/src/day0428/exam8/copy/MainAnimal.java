package day0428.exam8.copy;

public class MainAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird bird = new Bird();
		Cow cow = new Cow();
		
		System.out.println("======== cry() ========");
		animal.cry();
		bird.cry();
		cow.cry();
		
		Something something = new Something();
		System.out.println("======= cryBird() ======");
		something.cryBird(bird);
//		something.cryBird(cow);
//		something.cryBird(animal);
		
	}

}
