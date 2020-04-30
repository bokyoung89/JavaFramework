package day0428.exam8;

public class MainAnimal {

		//### polymorphic argument ### 입력 아규먼트가 적용 
	public static void main(String[] args) {
		Animal animal = new Animal();
		Bird bird = new Bird();
		Cow cow = new Cow();
//		
//		System.out.println("====== cry() =======");
//		animal.cry();
//		bird.cry();
//		cow.cry();
		
		Something something = new Something();
		System.out.println("====== cryBird() =======");
		something.cryBird(bird);
//		something.cryBird(cow); 버드와 카우는 상속 관게 없음
//		something.cryBird(animal); 버드는 애니멀의 하위 클래스
		System.out.println("====== cryCow() =======");
		something.cryCow(cow);
//		something.cryCow(bird); 카우와 버드는 상속 관계 없음
//		something.cryCow(animal); 카우는 애니멀의 하위 클래스
		System.out.println("====== cryAnimal() =======");
		something.cryAnimal(animal);
		something.cryAnimal(bird); //상속 애니멀 관계에서 가능. 
		something.cryAnimal(cow); //상속 애니멀 관계에서 가능.
	}
}
