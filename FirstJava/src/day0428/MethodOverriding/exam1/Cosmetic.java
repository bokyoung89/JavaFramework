package day0428.MethodOverriding.exam1;

public class Cosmetic extends Product{
	
	String capacity;
	String use;
	
	public Cosmetic(String name, int price, String capacity, String use){
		super(name, price);
		this.capacity = capacity;
		this.use = use;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}
	
	public void printInfo() {
		System.out.print("제품명=" + getName());
		System.out.print(" 가격=" + Util.getDecimalComma(price));
		System.out.print(" 용량=" + capacity);
		System.out.println(" 사용시기=" + use);
	}

	
}
