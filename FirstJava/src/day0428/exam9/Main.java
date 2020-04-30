package day0428.exam9;

public class Main {

	public static void main(String[] args) {
		// 상속 관계 : 오버라이드하면 메소드 하나만 써서 가능. 
		System.out.println("=== attack() ====");
		Archer archer = new Archer();
		archer.attack();
		Knight knight = new Knight();
		knight.attack();
		Wizard wizard = new Wizard();
		wizard.attack();
		
		//실제 만들어진 메소드가 실행된다.
		System.out.println("\n====== Virtual Method =========");
		Character character1 = new Archer();
		character1.attack();
		
		Character character2 = new Knight();
		character2.attack();
		
		Character character3 = new Wizard();
		character3.attack();
		
		//다형성(Polymorphism)
		Something something = new Something();
		System.out.println("\n====== Something =======");
		something.attack(archer);
		something.attack(knight);
		something.attack(wizard);
		
		
	}

}


