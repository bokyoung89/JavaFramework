package day0429.ex07.access;

import day0429.ex07.my.Something;

public class Main {
	
	//	### 접근제한자 access modifier ###
	//	* 클래스, 클래스 내 변수, 메소드들에 대한 접근을 제한
	//	* 종류
	//	public : 모든 클래스에서 접근 가능
	//	protected : 상속받은 객체 어디에서나 접근 가능. 상속관계가 없어도 같은 패키지면 접근 가능. (defalut + 상속)
	//	default : 같은 패키지 내에서만 접근 가능. 접근 제한자 지정하지 않을 때  default
	//	private : 같은 클래스 내에서만 접근 가능

	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		//### private method ###
//		p1.setAge(10);	//Error
//		p1.getAge();	//Error
		
		//### default method ###
		//같은 패키지 내에서만 접근 가능
		p1.setName("James");
		p1.getName();
		//다른 패키지이면 접근 불가능
		Something s = new Something();
//		s.work();		//Error
	}

}
