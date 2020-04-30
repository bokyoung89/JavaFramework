package day0427.Array.example4.exam;

import day0427.Array.example4.Person;

public class MainPerson {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		//type1
		person[0] = new Person("Park", 35);
		//type2
		person[1] = new Person();
		person[1].setName("Hong");
		person[1].setAge(30);
		//type3
		Person p = new Person("Park", 28);
		person[2] = p;
		
		for(int i=0;i<person.length;i++) {
			person[i].printInfo();
		}
	}
}

