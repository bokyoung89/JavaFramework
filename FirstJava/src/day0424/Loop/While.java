package day0424.Loop;

public class While {

	public static void main(String[] args) {

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
