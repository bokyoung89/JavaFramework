package day0429.ex04.collection;

public class MainPerson {

	public static void main(String[] args) {
		
		/* #### heterogeneous collection ####
		 * - 여러 다양한 타입으로 집합 만들어짐. ex)배열
		 * - 상속클래스이면 배열 데이터로 만들 수 있다.
		 */
		
		Person[] personArray = new Person[3];
		personArray[0] = new Person("Hong", 20);
		personArray[1] = new Student("Park", 20, "2019-001");
		personArray[2] = new Teacher("Lee", 25, "Music");
		
		for(int i=0; i<personArray.length;i++) {
			System.out.print((i+1)+".");
			personArray[i].printInfo();
		}
	}
}
