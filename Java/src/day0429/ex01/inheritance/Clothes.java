package day0429.ex01.inheritance;

public class Clothes {
	
	private String name;
	private String color;
	private String brand;
	
	public Clothes() {
	}
	
	public Clothes(String name, String color, String brand) {
		this.name = name;
		this.color = color;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void printInfo() {
		System.out.println("========== Clothes ===========");
		System.out.println("제품=" + name);
		System.out.println("색상=" + color);
		System.out.println("제조사=" + brand);
	}

}
