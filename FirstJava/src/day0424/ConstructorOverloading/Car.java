package day0424.ConstructorOverloading;

public class Car {
	//필드
	private String name;
	private String company;
	private String color;
	private int door;
	private int maxSpeed;
	
	//생성자 : 디폴트값
	public Car() {
		
	}
	//생성자 : 입력값 3개
	public Car(String name, String company, String color) {
		this.name = name;
		this.company = company;
		this.color = color;
	}
	//생성자 : 입력값  all
	public Car(String name, String company, String color, int door, int maxSpeed) {
		this.name = name;
		this.company = company;
		this.color = color;
		this.door = door;
		this.maxSpeed = maxSpeed;
	}

	//setter, getter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	//출력값
	public void printInfo() {
		System.out.println("Car Information ------");
		System.out.println("자동차명=[" + name + "]");
		System.out.println("제조사=[" + company + "]");
		System.out.println("색깔=[" + color + "]");
		System.out.println("문개수=[" + door + "]");
		System.out.println("최고속력=[" + maxSpeed + "]");
	}
	
}
