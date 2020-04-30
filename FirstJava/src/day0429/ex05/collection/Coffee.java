package day0429.ex05.collection;

public class Coffee extends Menu {
	
	private String beansName;
	
	public Coffee(String name, int price, String beansName) {
		super(name, price);
		this.beansName = beansName;
	}

	public String getBeansName() {
		return beansName;
	}

	public void setBeansName(String beansName) {
		this.beansName = beansName;
	}
	
	public void printInfo() {
		System.out.print("메뉴=" + getName());	
		System.out.print(" | 가격=" + getPrice());
		System.out.println(" | 원두=" + beansName);
	}
}
