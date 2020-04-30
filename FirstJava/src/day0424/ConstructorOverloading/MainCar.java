package day0424.ConstructorOverloading;

public class MainCar {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setName("K5");
		c1.setCompany("Kia");
		c1.setColor("Black");
		c1.setDoor(4);
		c1.setMaxSpeed(250);
		c1.printInfo();
		
		Car c2 = new Car("Santafe", "Hyundai", "White");
		c2.setDoor(5);
		c2.setMaxSpeed(220);
		c2.printInfo();
		
		Car c3 = new Car("A6", "Audi", "Red", 4, 300);
		c3.printInfo();
	}
}
