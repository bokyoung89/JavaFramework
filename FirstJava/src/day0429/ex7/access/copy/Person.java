package day0429.ex7.access.copy;

public class Person {
	
	private int age;
	private String name;
	private char sex;
	private String email;
	
	//==== private ====
	private int getAge() {
		return age;
	}
	private void setAge(int age) {
		this.age = age;
	}
	
	//==== default ====
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	//==== protected ====
	protected char getSex() {
		return sex;
	}
	protected void setSex(char sex) {
		this.sex = sex;
	}
	
	//==== public ====
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
	