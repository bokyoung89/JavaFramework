package day0427.Array.example5.exam;

public class MainActor {
	
	public static void main(String[] args) {
	//배우 정보
			String actorName = "해리슨 포드";
			String actorGender = "남자";
			String actorBirthdate = "1942.07.13";
			String actorNationality = "미국";
			Actor actor = new Actor(actorName, actorGender, actorBirthdate,actorNationality);
			actor.printInfo();
		}
	}

