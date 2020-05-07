package day0507.ex05.map;

import java.util.HashMap;
import java.util.Map;

public class ex05 {

	public static void main(String[] args) {
		
		//선언 및 생성
		System.out.println("======= 생성 =========");
		Map map = new HashMap();
		System.out.println("isEmpty=" + map.isEmpty());
		System.out.println("|size()=" + map.size());
		
		//입력
		System.out.println("======= 추가 ========");
		map.put("a", "water");	//a(key)라는 이름으로 값(value)을 찾는다.
		map.put("b", "milk");
		map.put("c", "coffee");
		
		//키 존재 여부
		System.out.println("====== 키 존재 여부 ========");
		boolean containsYn = map.containsKey("a");
		System.out.println("key=a|키존재여부=" + containsYn);
		
		//검색
		System.out.println("====== 검색 ========");
		Object obj1 = map.get("a");
		String stringObj1 = (String) obj1;
		System.out.println("key=a|value=" + stringObj1);
		
		//수정
		//동일한 이름의 키로 put하면 이전 동일 이름 키 데이터는 삭제된다.
		System.out.println("====== 수정 ========");
		map.put("b", "tea");
		Object obj2 = map.get("b");
		String stringObj2 = (String) obj2;
		System.out.println("key=a|value=" + stringObj2);
		
		//삭제
		System.out.println("====== 삭제 ========");
		map.remove("c");
		Object obj3 = map.get("c");
		String stringObj3 = (String) obj3;
		System.out.println("key=a|value=" + stringObj3);
	}

}
