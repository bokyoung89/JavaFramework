package day0507.ex03.ListEx;

public class Menu {
	
	private String name;
	private int price;
	private String flavor;

	public Menu(String name, int price) {
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
	
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void printInfo() {
		System.out.print("메뉴=" + name);	
		System.out.print(" | 가격=" + price);
	}
}