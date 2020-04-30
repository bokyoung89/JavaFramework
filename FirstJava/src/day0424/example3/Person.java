//객체 초기화
package day0424.example3;

public class Person {
	//Variable, 디폴트 초기화(변수 최초 셋팅) 
//	private String name;	//이름
//	private char sex;	//성별
//	private int age;	//나이
//	private float height;	//몸무게
//	private boolean marridgeYn;	//결혼여부
	
	//Variable. 명시적 설정
	private String name = "James";	//이름
	private char sex = 'F';	//성별
	private int age = 30;	//나이
	private float height = 180.5f;	//몸무게
	private boolean marridgeYn = false;	//결혼여부
	
	//Constructor
	public Person() {
		
	}
	//생성자 초기화
	public Person(String name, char sex, int age, float height, boolean marridgeYn) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.marridgeYn = marridgeYn;
	}
	//Method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isMarridgeYn() {
		return marridgeYn;
	}

	public void setMarridgeYn(boolean marridgeYn) {
		this.marridgeYn = marridgeYn;
	}
	//출력
	public void printInfo() {
		System.out.println("------------ Person Info -------------");
		System.out.print("name=[" + name + "]");
		System.out.print("sex=[" + sex + "]");
		System.out.print("age=[" + age + "]");
		System.out.print("height=[" + height + "]");
		System.out.println("marridgeYn=[" + marridgeYn + "]");
	}
}
