package day0427.Array.example5.exam;

public class MainMovie {

	public static void main(String[] args) {

				String title = "Star Wars";
				String category = "SF";
				String director = "JJ 에이브럼스";
				int runningTime = 135;
				
				String actorArray[] = {"조니뎁", "올랜드 볼륨", "키이라 나이틀리"};
				Movie m1 = new Movie(title, category, director, runningTime, actorArray);
				m1.printInfo();
				
				//Movie 객체에서 배우(배열) 정보 얻기
				System.out.println("\n===== 출연 배우 =======");
				String[] actors = m1.getActors();
				for(int i=0; i<actors.length; i++) {
					System.out.println(actors[i]);
				}
		}

}
