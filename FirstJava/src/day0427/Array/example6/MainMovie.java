package day0427.Array.example6;

public class MainMovie {

	public static void main(String[] args) {
				// 영화 정보
				String title = "Star Wars";
				String category = "SF";
				String director = "JJ 에이브럼스";
				int runningTime = 135;

				Actor[] actorArray = new Actor[3];
				actorArray[0] = new Actor("조니뎁", "남자", "1963년 6월 9일", "미국");
				actorArray[1] = new Actor("올랜드 볼륨", "남자", "1977년 1월 13일", "영국");
				actorArray[2] = new Actor("키이라 나이틀리", "여자", "1985년 3월 26일", "미국");
				Movie movie = new Movie(title, category, director, runningTime, actorArray);
				movie.printInfo();
	}
}
