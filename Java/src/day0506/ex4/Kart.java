package day0506.ex4;

public class Kart {
	
	private String name;
	private String color;
	private int speed;
	private int booster;
	
	public Kart(String name, String color, int speed, int booster) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		this.booster = booster;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getBooster() {
		return booster;
	}

	public void setBooster(int booster) {
		this.booster = booster;
	}

	public void printInfo() {
		System.out.print("[버스트("+color+")]");
		System.out.print(" 속도" + speed+"(km)/");
		System.out.println(" 부스터 : " + booster +"(개)");
	}
	
	public void speedUp() {
		speed+=40;
		if(speed<=100) {
			speed=100;
		}
		printInfo();
	}
	
	public void speedDown() {
		speed-=40;
		if(speed<=100) {
			speed=0;
		}
		printInfo();
	}	
	
	public void pickupBooster() {
		booster++;
		if(booster>2) {
			booster=2;
		}
		printInfo();
	}	

	public void useBooster() {
		if(booster>0) {
			booster--;
			speed+=80;
			if(speed>=100)
				speed=100;
			}
			printInfo();
	}
}