package day0424.example5.copy;

public class MainActor {

	public static void main(String[] args) {
		String actorName = "해리슨 포드";
		String actorGender = "남자";
		String actorBirthdate = "1942.07.13";
		String actorNationality = "미국";
		Actor a1 = new Actor(actorName, actorGender, actorBirthdate, actorNationality);
		a1.printInfo();
	}

}
