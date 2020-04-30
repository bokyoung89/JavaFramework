package day0424.example5.copy;

public class Actor {
	private String name;
	private String gender;
	private String birthdate;
	private String nationality;
	
	public Actor(String name, String gender, String birthdate, String nationality) {
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void printInfo() {
		System.out.println("------Actor Information------");
		System.out.print("[영화 제목 : " + name + "] ");
		System.out.print("[장르 : " + gender +"] ");
		System.out.print("[감독 : " + birthdate + "] ");
		System.out.print("[러닝 타임 : " + nationality + "] ");
	}
}
