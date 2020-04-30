package day0423.exam;

public class Coffee {
	private String name;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void printInfo() {	
		System.out.print("[" + getName() + "]" );
		System.out.println(" : " + getPrice());
	}
	

}
