package day0506.ex4;

public class Main {

	public static void main(String[] args) {
		// ### 클래스 생성 ###
		// 생성자 : 카트명, 
		Kart kart = new Kart("버스트", "Green", 0, 0);
		System.out.println("=== READY ===");
		kart.printInfo();
		System.out.println("=== speedUp()===");
		kart.speedUp();
		kart.speedUp();
		kart.speedUp();
		System.out.println("=== speedDown()===");
		kart.speedDown();
		kart.speedDown();
		kart.speedDown();
		System.out.println("=== pickupBooster()===");
		kart.pickupBooster();
		kart.pickupBooster();
		kart.pickupBooster();
		System.out.println("=== useBooster()===");
		kart.useBooster();
		kart.useBooster();
		kart.useBooster();
		
		
	}
}
