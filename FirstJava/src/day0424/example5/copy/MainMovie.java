package day0424.example5.copy;

public class MainMovie {

	public static void main(String[] args) {
		String actorName = "해리슨 포드";
		String actorGender = "남자";
		String actorBirthdate = "1942.07.13";
		String actorNationality = "미국";
		Actor actor = new Actor(actorName, actorGender, actorBirthdate, actorNationality);
		
		String title = "Star wars";
		String category = "SF";
		String director = "JJ 에이브럼스";
		int runningTime = 135;
		//String actor = "해리슨 포드";
		Movie m1 = new Movie(title, category, director, runningTime, actor);
		m1.printInfo();
	}
}
