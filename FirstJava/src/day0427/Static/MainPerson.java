package day0427.Static;

import day0427.Array.example4.Person;

public class MainPerson {
		int data;

	public static void main(String[] args) {
		
//		Person p1 = new Person("Kim");
//		p1.printInfo();
//		
//		Person p2 = new Person("Lee");
//		p2.printInfo();
//		
//		Person p3 = new Person("Park");
//		p3.printInfo();
		
		Person p4 = new Person();
//		p4.sayHello();
		p4.sayWelcome();
		
//		Person.sayHello();
		Person.sayWelcome();
		/* static 메소드 사용
		 * - 장점 : 해당 클래스 이름으로 접근 가능. 객체를 매번 만들지 않아도 된다.
		 */
		
		//사용 가능
		int a = 10;
		Person p = new Person(); // 객체 레퍼런스
		
		//error
//		data = 20; //non-static 변수
		
	}

}

