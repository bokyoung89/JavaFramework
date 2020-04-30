package day0429.ex01.inheritance;

public class Pants extends Clothes{
	
	private String lengthType;
	
	public Pants(String name, String color, String brand, String lengthType) {
		super(name, color, brand);
		this.lengthType = lengthType;
	}

	public String getLengthType() {
		return lengthType;
	}

	public void setLengthType(String lengthType) {
		this.lengthType = lengthType;
	}

	public void printInfo() {
		System.out.println("========== Pants ===========");
		System.out.println("제품=" + getName());	//변수는 private이므로 get으로 얻어옴
		System.out.println("색상=" + getColor());
		System.out.println("제조사=" + getBrand());
		System.out.println("바지유형=" + lengthType);
	}


	
	

}
