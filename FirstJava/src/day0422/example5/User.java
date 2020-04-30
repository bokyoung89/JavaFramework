package day0422.example5;

public class User {
	private String id;	//아이디
	private String name;	//이름
	private String email;	//이메일
	private int grade;	//등급
	private boolean marridgeYn;	//결혼 여부
	
	public void setId(String newId) {
		id = newId;
	}
	public String getId() {
		return id;
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	public String getEmail() {
		return email;
	}
	public void setGrade(int newGrade) {
		grade = newGrade;
	}
	public int getGrade() {
		return grade;
	}
	public void setMarridgeYn(boolean newMarridgeYn) {
		marridgeYn = newMarridgeYn;
	}
	public boolean getMarridgeYn() {
		return marridgeYn;
	}
	
	public void printInfo() {
		System.out.println("======== 회원 정보 ========");
		System.out.println("아이디 :" + getId());
		System.out.println("이름 : " + getName());	
		System.out.println("이메일 : " + getEmail());	
		System.out.println("등급 : " + getGrade());
		System.out.println("결혼 여부 : " + getMarridgeYn());
		System.out.println("=======================");
	}
	
	
}
