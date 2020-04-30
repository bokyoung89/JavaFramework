package day0423.exam;

public class Example1 {

	public static void main(String[] args) {
		
		//Object1
		Coffee coffee1 = new Coffee();
		coffee1.setName("아메리카노");
		coffee1.setPrice(4000);
		
		System.out.println("======== 메뉴판 ========");
		System.out.println();
		
		coffee1.printInfo();
		
		//Object2
		Coffee coffee2 = new Coffee();
		coffee2.setName("카푸치노");
		coffee2.setPrice(4500);
		
		coffee2.printInfo();
	}

}
