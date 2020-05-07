package day0507.ex01.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
	// ### LIST와 배열의 차이 ###
	//배열은 정수도 가능, 컬렉션의 리스트는 객체만 가능 (레퍼 클래스)
	//배열은 사이즈가 고정됨. 리스트는  add를 통해 계속 추가 가능. 훨씬 더 탄력성 있다.
	//고정값 갖는 데이터는 배열로, 사이즈가 불명확하면 list로 작업
	
	public static void main(String[] args) {
		
//		//선언 및 생성
//		System.out.println("=== 생성 ===");
//		List list = new ArrayList();
//		System.out.print("isEmpty=" + list.isEmpty());
//		System.out.println("|size()=" +  list.size());	//갯수 확인
//		
//		//추가
//		System.out.println("=== 추가 ===");
//		list.add(new Integer(10)); //전부 다 객체화 시켜서 접근
//		list.add(new Integer(20)); //전부 다 객체
//		list.add(new Integer(30)); //전부 다 객체
//		for(int i = 0; i<list.size(); i++) {	
//			Object obj = list.get(i);		//인덱스를 통해 하나씩 접근
//			Integer intObj = (Integer) obj;	//캐스팅
//			System.out.println("list[" + i + "]=" + intObj);
//		}
//		
//		//추가(인덱스)
//		System.out.println("=== 추가(index) ===");
//		list.add(1, new Integer(11));
//		for(int i = 0; i<list.size(); i++) {	
//			Object obj = list.get(i);		//인덱스를 통해 하나씩 접근
//			Integer intObj = (Integer) obj;	//캐스팅
//			System.out.println("list[" + i + "]=" + intObj);
//		}
//		
//		//수정
//		System.out.println("=== 수정 ===");
//		list.set(1, new Integer(12));
//		for(int i = 0; i<list.size(); i++) {	
//			Object obj = list.get(i);		//인덱스를 통해 하나씩 접근
//			Integer intObj = (Integer) obj;	//캐스팅
//			System.out.println("list[" + i + "]=" + intObj);
//		}
//		
//		//삭제
//		System.out.println("=== 삭제 === ");
//		list.remove(1);
//		for(int i = 0; i<list.size(); i++) {	
//			Object obj = list.get(i);		//인덱스를 통해 하나씩 접근
//			Integer intObj = (Integer) obj;	//캐스팅
//			System.out.println("list[" + i + "]=" + intObj);
//		}
//		
//		//전체 삭제
//		System.out.println("=== 전체 삭제 === ");
//		list.clear();
//		System.out.println("isEmpty=" + list.isEmpty());
//		System.out.println("|size()=" + list.size());
	
		//선언 및 생성
		ArrayList list = new ArrayList();
		//add
		System.out.println("=== add() ===");
		list.add(new String("월"));
		list.add(new String("화"));
		list.add(new String("수"));
		list.add(new String("목"));
		list.add(new String("금"));
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			String stringObj = (String) obj;
			System.out.println("list[" + i + "]" + stringObj);
		}
		
		//remove()
		System.out.println("=== remove()===");
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			String stringObj = (String) obj;
			
			if(stringObj.equals("수")) {
				list.remove(i);	//remove 실행 이후 list 재조정
			}
		}
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			String stringObj = (String) obj;
			System.out.println("list[" + i + "]" + stringObj);
		}
	}
}
