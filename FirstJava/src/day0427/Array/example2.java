package day0427.Array;

public class example2 {

	public static void main(String[] args) {
		//Declaration
		String[] stringArray;
		//Creation
		stringArray = new String[3];
		//initialzation
		stringArray[0] = new String("Hello");
		stringArray[1] = new String("Java");
		stringArray[2] = new String("Brain");
		
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
		
		for(int i=0; i<stringArray.length; i++) {
			System.out.print("stringArray[" + i + "]");
			System.out.println(stringArray[i]);
		}
	}
}
