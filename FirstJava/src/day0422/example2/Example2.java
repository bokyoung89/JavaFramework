package day0422.example2;

public class Example2 {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		
		m1.title = "겨울왕국2";
		System.out.println(m1.title);
		String title1 = m1.title;
		System.out.println(title1);
		
		m1.director = "나 감독";
		System.out.println(m1.director);
		
		m1.actor = "나 배우";
		System.out.println(m1.actor);
		
		m1.runningTime = 105;
		System.out.println(m1.runningTime);
		
	}

}
