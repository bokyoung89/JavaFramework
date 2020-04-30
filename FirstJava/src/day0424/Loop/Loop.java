package day0424.Loop;

public class Loop {

	public static void main(String[] args) {
		
		//--- for문 구구단 ---
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			} System.out.println();
		}
		
		//--- break, continue ---
		System.out.println("---- for() : Start ----");
		for(int i = 0; i <5; i++) {
			System.out.println(i);
			if(i>2) {
				continue; //현재 시점에서 멈추고 나머지 작업 끝내고  for문으로 돌아가라.
						  //break문 : 실행 멈추고 빠져나가라.
			}
			System.out.println("End");
		} 
		System.out.println("---- for() : End ----");
		
		//--- while문 ---
		int i = 1;
		while(i < 5) {
			System.out.println("i=" + i);
			i = i + 1; //i가 1씩 증가
		} 
		System.out.println();
		
		i = 1;
		do {
			System.out.println("i=" + i);
			i = i + 1; //i가 1씩 증가
		} while(i < 5);
	}
}

