package day0506.ex5.Interface;

public class Main {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.eat();
		
		Human h = new Human(29, "James"); //나이, 이름
		System.out.print("[Human] 나이=" + h.getAge());
		System.out.println("|이름=" + h.getName());
		h.eat();
		
		Bird b = new Bird(5,2);	//나이, 날개수
		System.out.print("[Bird] 나이=" + b.getAge());
		System.out.println("|날개수=" + b.getWing());
		b.eat();
		b.takeoff();
		b.land();
		b.fly();
		
		SuperMan sm = new SuperMan(30, "Song");//나이, 이름
		System.out.print("[SuperMan] 나이=" + h.getAge());
		System.out.println("|이름=" + h.getName());
		sm.eat();
		sm.takeoff();
		sm.land();
		sm.fly();
		
		Airplane air = new Airplane();
		air.load();
		air.takeoff();
		air.fly();
		air.land();
		air.unload();
	}
}
