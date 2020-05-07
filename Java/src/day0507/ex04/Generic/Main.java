package day0507.ex04.Generic;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 기본 코드
		List list1 = new ArrayList();
		list1.add("월");
		list1.add("화");
		list1.add("수");
		String s1 = (String) list1.get(0);	//Casting
		System.out.println(s1);
		//	제네릭
//		 	* 선언
//		 	클래스(인터페이스)<적용할 타입> 변수명;
//			* 생성
//			변수명 = new 생성자 <적용할 타입)();
		List<String> list2 = new ArrayList<String>();
		list2.add("월");
		list2.add("화");
		list2.add("수");
		System.out.println("======== 제네릭 ========");
		String s2 = list2.get(0);
		System.out.println(s2);

	}

}
