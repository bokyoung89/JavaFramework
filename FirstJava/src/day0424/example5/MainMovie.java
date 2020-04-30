package day0424.example5;

public class MainMovie {

	public static void main(String[] args) {
				// 배우 정보
				String actorName = "해리슨 포드";
				String actorGender = "남자";
				String actorBirthDate = "1942.07.13";
				String actorNationality = "미국";
				Actor actor = new Actor(actorName, actorGender, actorBirthDate, actorNationality);
				
				// 영화 정보
				String title = "Star Wars";
				String Category = "SF";
				String Director = "JJ 에이브럼스";
				int RunningTime = 135;
				//	String actor = "해리슨 포드";
				Movie m1 = new Movie(title, Category, Director, RunningTime, actor);
				m1.printInfo();

	}

}
