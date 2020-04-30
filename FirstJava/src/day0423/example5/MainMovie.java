package day0423.example5;

public class MainMovie {

	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.setTitle("Star Wars");
		m1.setCategory("SF");
		m1.setDirector("JJ 에이브럼스");
		m1.setRunningTime(135);
		m1.printInfo();
		
		Movie m2 = new Movie("SF","아바타");
		m2.setDirector("JJ 에이브럼스");
		m2.setRunningTime(162);
		m2.printInfo();
		
		Movie m3 = new Movie("블랙팬서", "액션", "라이언 쿠글러", 135);
		m3.printInfo();
		
	}

}
