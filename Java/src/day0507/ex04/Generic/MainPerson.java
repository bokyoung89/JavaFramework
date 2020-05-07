package day0507.ex04.Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainPerson {

	public static void main(String[] args) {
		//선언 및 생성
		Map map1 = new HashMap();
		map1.put("A", new Person("Kim", 20));
		map1.put("B", new Person("Lee", 25));
		map1.put("C", new Person("Park", 30));
		//검색
		Person p1 = (Person) map1.get("A");
		p1.printInfo();
		// ### 제네릭 ###
		// 선언 및 생성
		Map <String, Person> map2 = new HashMap<String, Person>();
		map2.put("A", new Person("Kim", 20));
		map2.put("B", new Person("Lee", 25));
		map2.put("C", new Person("Park", 30));
		//검색
		Person p2 = map2.get("B");
		p2.printInfo();
	}
}
