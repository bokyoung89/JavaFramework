package day0427.Array.example5;

public class MainMovie {

	public static void main(String[] args) {
				// 영화 정보
				String title = "Star Wars";
				String category = "SF";
				String director = "JJ 에이브럼스";
				int runningTime = 135;
				//배우 정보
				String[] actorArray = new String[3];
				actorArray[0] = new String("조니뎁");
				actorArray[1] = new String("올랜드 볼륨");
				actorArray[2]= new String("키이라 나이틀리");
				Movie m1 = new Movie(title, category, director, runningTime, actorArray);
				m1.printInfo();
				//Movie 객체에서 배우(배열) 정보 얻기
				System.out.println("\n====== 출연 배우 ======");
				String[] actors = m1.getActors();
				for(int i=0; i<actors.length; i++) {
					System.out.println(actors[i]);
				}
	}

}