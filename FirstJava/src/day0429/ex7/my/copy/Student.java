package day0429.ex7.my.copy;

import day0429.ex07.access.Person;

public class Student extends Person{
	
	public void work() {
		//setName("James");	//error default method
		setSex('F');	//protected method : person과 패키지는 다르지만 상속을 받으므로 접근 가능
		setEmail("my@email.com");	//public method
		
	}
}
