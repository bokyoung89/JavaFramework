package day0429.ex7.access.copy;

import day0429.ex07.my.Something;

public class Main {

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
