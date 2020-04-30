package day0422.example7;

public class FootballPlayer {

	private String name;
	private String team;
	private int number;
	private int speed;
	private int skill;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getTeam() {
		return team;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSkill(int skill) {
		this.skill = skill;
	}
	public int getSkill() {
		return skill;
	}
	
	public void printInfo() {
		System.out.println("========================Player Information==============");
		System.out.print("Name = [" + getName() + "] ");
		System.out.print("Team = [" + getTeam() + "] ");
		System.out.print("Number = [" + getNumber() + "] ");
		System.out.print("Speed = [" + getSpeed() + "] ");
		System.out.println("Skill = [" + getSkill() + "] ");		
	}
}
