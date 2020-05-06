package day0506.ex5.Interface;

public class Airplane implements Flyer, Transport{

	public void takeoff() {
		System.out.println("Airplane.takeoff()");
	}

	public void land() {
		System.out.println("Airplane.land()");
	}

	public void fly() {
		System.out.println("Airplane.fly()");
	}
	
	public void load() {
		System.out.println("Airplane.load()");
	}

	public void unload() {
		System.out.println("Airplane.unload()");
	}


	
	

}
