package day0429.ex01.inheritance;

public class Shirt extends Clothes{
	
	private String type;
	private String size;
	
	public Shirt(String name, String color, String brand, String type, String size) {
		super(name, color, brand);
		this.type = type;
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public void printInfo() {
		System.out.println("========== Shirt ===========");
		System.out.println("제품=" + getName()); //부모클래스 private한 변수를 간접적인 메소드(get)로 가져온다.
		System.out.println("색상=" + getColor());
		System.out.println("제조사=" + getBrand());
		System.out.println("소매유형=" + type);
		System.out.println("크기=" + size);
	}
		
}
