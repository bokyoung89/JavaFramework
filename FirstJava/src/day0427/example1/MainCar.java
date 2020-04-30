package day0427.example1;

public class MainCar {

	public static void main(String[] args) {
		String companyName = "Audi";
		String address = "독일";
		String phone = "123-4567";
		Company company = new Company(companyName, address, phone);
		company.printInfo();
	
		String name = "A6";
		String color = "Red";
		int door = 4;
		int maxSpeed = 300;
		Car c1 = new Car(name, company, color, door, maxSpeed);
								//Company 타입의 데이터
		c1.printInfo();
	}
}
