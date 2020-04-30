package day0428.MethodOverriding.exam1;

public class Shirt extends Product{
	
	private String color;
	private String size;
	
	public Shirt(String name, int price, String color, String size) {
		super(name, price);
		this.color = color;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public void printInfo() {
		System.out.print("제품명=" + getName());
		System.out.print(" 가격=" + Util.getDecimalComma(price));
		System.out.print(" 색깔=" + color);
		System.out.println(" 크기=" + size);
	}
	

}
