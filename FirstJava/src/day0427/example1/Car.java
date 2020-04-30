package day0427.example1;

public class Car {

	private String name;
	private Company company;
	private String color;
	private int door;
	private int maxSpeed;
	
	public Car(String name, Company company, String color, int door, int maxSpeed) {
		this.name = name;
		this.company = company;
		this.color = color;
		this.door = door;
		this.maxSpeed = maxSpeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
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
		System.out.println("------ 자동차 정보 ------");
		System.out.println("자동차명=[" + name + "]");
		System.out.println("색깔=[" + color + "]");
		System.out.println("문개수=[" + door + "]");
		System.out.println("최고속력=[" + maxSpeed + "]");
		company.printInfo();
	}
	
}
