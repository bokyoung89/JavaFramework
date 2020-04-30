package day0428.MethodOverriding.exam1;

public class Main {

	public static void main(String[] args) {
		
		String productName = "홍삼";
		int productPrice = 15000;
		Product p = new Product(productName, productPrice);
		p.printInfo();
		
		String shirtName = "미니언즈 반팔티";
		int shirtPrice = 8000;
		String shirtColor = "red";
		String shirtSize = "L";
		Shirt t = new Shirt(shirtName, shirtPrice, shirtColor, shirtSize);
		t.printInfo();
		
		String cosmeticName = "비자 시카 밤";
		int cosmeticPrice = 15000;
		String cosmeticCapacity = "40ml";
		String cosmeticUse = "낮/밤 모두 사용";
		Cosmetic c = new Cosmetic(cosmeticName, cosmeticPrice, cosmeticCapacity, cosmeticUse);
		c.printInfo();
		
	}

}
