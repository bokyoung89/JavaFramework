package day0506.ex2.Interface;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== Sedan ====");
		Sedan s1 = new Sedan("아반떼");
		s1.getOn();
		s1.getOff();
		Sedan s2 = new Sedan("K5");
		s2.getOn();
		s2.getOff();
		
		System.out.println("===== Truck ====");
		Truck t1 = new Truck("마이티");
		t1.load();
		t1.unload();
		Truck t2 = new Truck("봉고");
		t2.load();
		t2.unload();
		
		System.out.println("===== Suv ====");
		Suv u1 = new Suv("싼타페");
		u1.getOn();
		u1.getOff();
		u1.load();
		u1.unload();
		
		//===Reference 1===
		System.out.println("===Reference 1===");
		Car cs = new Sedan("Audi");
		System.out.println("자동차=" + cs.getName());
		Sedan sedan1 = (Sedan) cs;	//casting은 상위 클래스 --> 하위 클래스로 변환
		sedan1.getOn();
		sedan1.getOff();

		//===Reference 2=== 
		System.out.println("===Reference 2===");
		PassengerModel ps = new Sedan("BMW");
		//System.out.println("자동차=" + ps.getName());	//에러
		ps.getOn();
		ps.getOff();
	}

}
