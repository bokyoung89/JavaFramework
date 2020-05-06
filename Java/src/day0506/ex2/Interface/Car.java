package day0506.ex2.Interface;

public abstract class Car {	//객체 생성이 안 되도록 강제로 abstract 선언
	
	private String name;
	
	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
