package day0428.exam9.copy;

public class Main {

	public static void main(String[] args) {
		//상속관계 : 오버라이드하면 메소드 하나만 써서 사용 가능.
		System.out.println("===== attack() =====");
		Archer archer = new Archer();
		archer.attack();
		Knight knight = new Knight();
		knight.attack();
		Wizard wizard = new Wizard();
		wizard.attack();
		
		//상속 클래스에서는 오버라이드된 메소드를 실행할 수 있다.
		System.out.println("\n====== Virtual Method =======");
		Character character1 = new Archer();
		character1.attack();
		Character character2 = new Knight();
		character2.attack();
		Character character3 = new Wizard();
		character3.attack();
		
		//다형성
		Something something = new Something();
		System.out.println("\n======= Something ========");
		something.attack(archer);
		something.attack(knight);
		something.attack(wizard);
	}

}
