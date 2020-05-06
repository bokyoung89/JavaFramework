package day0506.ex6.Api;

//import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		
		//랜덤 함수 시작
		
		//int형 배열 random을 생성하고 6개가 들어갈 공간을 만듦.
		int[] intArray = new int[7];
		
		for(int i=0; i<intArray.length; i++) {
			 intArray[i]= (int)(Math.random()*45+1);
			
			//중복 제거
			for(int j=0; j<i; j++) {
				if(intArray[i] == intArray[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<intArray.length; i++) {
		System.out.print(intArray[i] + "   ");
		}	
	}
}
		//	====== 2번 ======
//		int[] intArray = new int[7];
//		
//		for(int i=0; i<intArray.length;i++) {
//			
//			boolean flag = true;
//			while(flag) {
//				double random = Math.random();
//				int randomint = (int)(random * 100);
//				if((randomint > 0) && (randomint < 46)) {
//					
//					//====== 중복 검사 ======
//					boolean duplication = false;
//					for(int j=0; j<i; j++) {
//						if(randomint == intArray[j]) {
//							duplication = true;
//						}
//					}	//end : for()
//						// ===============================
//					
//					if(duplication) {	//중복이 아닐 경우에만 배열에 추가
//						intArray[i] = randomint;
//						flag = false;
//					}
//				}	//end : if() : 조건에 따른 랜덤한 수 추출
//				  	
//				}
//			}
//		}
		
		//	====== 3번 ======
//		int[] intArray = new int[7];
//		int index=0;
//		int random;
//		
//		while(index<7) {
//			random=(int)((Math.random()*100%45)+1);
//			if(duplicate(random, intArray)==true) {
//				intArray[index]=random;
//				index++;//넣을 수 있음
//			}
//		}
//		Arrays.sort(intArray);
//		for(int i=0;i<7;i++)
//			System.out.println(intArray[i] + " ");
//	}
//	
//	public static boolean duplicate(int random, int intArr[]) {
//		for(int i=0;i<intArr.length;i++) {
//			if(random==intArr[i])//현재 배열의 길이만큼 돌리고 만약 같은게 있다면 거짓 반환
//				return false;
//		}		
//		return true;//배열의 길이만큼 돌린 결과 중복 없으면? 참 반환.
//	}
	
		
//		//배열
//		int[] intArray = new int[7];		
//		for(int i=0; i<6; i++) {
//			intArray[i] = (int) (Math.random()*45+1);
//		} for(int i=0; i<intArray.length; i++) {
//			System.out.print(intArray[i]);
//		}	
//	}


