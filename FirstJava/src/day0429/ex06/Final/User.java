package day0429.ex06.Final;

public class User {
	
//	### final ###
//	- 원래 기능을 못하고 만들어진 형태가 마지막인 클래스. 상속 불가.
//	- final class : 상속 x
//	- final method : override x
//	- final variable : 상수
//
//	* 변수 : 데이터가 변할 수 있다.
//		int a = 10;
//		a = 20;
//
//	* 상수 : 데이터가 변할 수 없다. 고정값.
//		finla int a = 10;
//		a = 20; //error 
//
//	- 반드시 초기화를 해줘야 함. 클래스에서 setter 지원하지 않는다.
//	- 변수 선언 시 명시적 초기화. 이미 초기화 됐으므로 생성자에서는 명시할 필요 없음.
//	- 명시적 초기화 하지 않았다면, 생성자 초기화 필수
	
	private String name;
	private final String id = "myId";	// 1.명시적 초기화 : 생성자에서 초기화 할 필요 없음

//	public String setId() {		Error 클래스에서 setter 지원하지 않는다.
//		this.id = id;
//	}
	
	public User() {
//		id="myid";	// 2.생성자 초기화 : 변수에서 명시적 초기화가 없을 때는, 강제로 초기화 되어야 함. 
	}
	
	public User(String name, String id) {
		this.name = name;
//		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printInfo() {
		System.out.print("이름 =" + name);
		System.out.println("|아이디 =" + id);
	}
}
