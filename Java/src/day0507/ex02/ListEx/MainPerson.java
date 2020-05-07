package day0507.ex02.ListEx;

import java.util.ArrayList;

public class MainPerson {

	public static void main(String[] args) {
		
	ArrayList personList = new ArrayList();
	
	//add()
	Person p1 = new Person("Kim", 20);
	Person p2 = new Person("Lee", 22);
	personList.add(p1);
	personList.add(p2);
	personList.add(new Person("Park", 25));

	for(int i=0; i<personList.size(); i++) {
		System.out.print((i+1) + ".");
		Object obj = personList.get(i);
		Person personObj = (Person) obj;
		personObj.printInfo();
		}	
	}
}
