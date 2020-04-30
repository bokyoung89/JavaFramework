package day0427.Array;

public class example1 {

	public static void main(String[] args) {
		int [] intArray;
		
		intArray = new int[2];
		//int []intArray = new int[2];
		
		//initialization
		intArray[0] = 1;
		intArray[1] = 2;
				//index
		
		//Output
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		
		//Output : length
		int arrayLength = intArray.length;
		System.out.println("배열길이=[" + arrayLength + "]");
		// 총 공간의 갯수 출력
		for(int i=0; i<intArray.length; i++) {
			System.out.print("intArray[" + i + "]");
			System.out.println(intArray[i]);
		}
		
			System.out.println();
		
		int[] intArray1 = new int[2]; //선언 및 생성
		intArray1[0] = 10;
		intArray1[1] = 20;
		for(int i=0; i<intArray1.length; i++) {
			System.out.print("intArray1[" + i + "]");
			System.out.println(intArray1[i]);
		}
		
		//Array initializer 
		int intArray2[] = {10, 20}; //배열값 한번에 지정
		System.out.println();
		for(int i=0; i<intArray1.length; i++) {
			System.out.print("intArray2[" + i + "]");
			System.out.println(intArray2[i]);
		}
		
			System.out.println();
		
		String[] arrayStr1 = new String[2];
		arrayStr1[0] = "Hello";
		arrayStr1[1] = "Java";
		for(int i=0; i<arrayStr1.length; i++) {
			System.out.print("arrayStr1[" + i + "]");
			System.out.println(arrayStr1[i]);
		}
		
		//String initializer 
		String arrayStr2[] = {"Hello", "Java"};
		System.out.println();
		for(int i=0; i<arrayStr1.length; i++) {
			System.out.print("arrayStr2[" + i + "]");
			System.out.println(arrayStr2[i]);
		}
		
	}
}