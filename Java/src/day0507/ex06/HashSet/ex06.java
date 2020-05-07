package day0507.ex06.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class ex06 {

	public static void main(String[] args) {
		//중복된 건 입력하지 않는다.
		
		//선언 및 생성
		System.out.println("===== 생성 ======");
		HashSet set = new HashSet();
		System.out.println("isEmply=" + set.isEmpty());
		System.out.println("|size()=" + set.size());
		//추가
		System.out.println("===== 추가 ======");
		set.add("water");
		set.add("milk");
		set.add("coffee");
		set.add("coffee");
		//검색
		System.out.println("===== 검색 ======");
		//index가 없다. 따라서 Iterator 사용
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String stringObj = (String) obj;
			System.out.println(stringObj);
		}
		
		//삭제
		System.out.println("===== 삭제 ======");
		boolean remove1 = set.remove("coffee");
		System.out.println("삭제 결과=" + remove1);
	}

}
