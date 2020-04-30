package day0422.example4;

public class Example4 {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 20;
//		int c = a + b;
//		System.out.println(c);
//		System.out.println(a + b);
//		
//		String s1 = "Hello";
//		String s2 = "Ace";
//		String s3 = s1 + s2;
//		System.out.println(s3);
//		System.out.println(s1 + s2);
//		System.out.println(a + s1);
		
		Song s = new Song();
		s.setTitle("I belive");
		s.setSinger("신승훈");
		s.setTime(3);
		System.out.println("제목 :" +s.getTitle());
		System.out.println("가수 :" +s.getSinger());
		System.out.println("시간 :" +s.getTime());
		
//		s.title = "dna";
//		System.out.println(s.title);
		
		Song s2 = new Song();		
//		s2.setTitle("밤편지");
//		s2.setSinger("아이유");
//		s2.setTime(180);
//		System.out.println("제목 :" +s2.getTitle());
//		System.out.println("가수 :" +s2.getSinger());
//		System.out.println("시간 :" +s2.getTime());
	}

}
