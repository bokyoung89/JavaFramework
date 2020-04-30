package day0427.Array.example6;

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
		System.out.print("이름=[" + name + "] ");
		System.out.print("성별=[" + gender + "] ");
		System.out.print("출생=[" + birthdate + "] ");
		System.out.println("국적=[" +nationality + "]");
	}

}	