package day0428.MethodOverriding.exam1;

public class Product {
	
	String name;
	int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.print("제품명=" + name);
		System.out.println(" 가격=" + Util.getDecimalComma(price));
	}

}
