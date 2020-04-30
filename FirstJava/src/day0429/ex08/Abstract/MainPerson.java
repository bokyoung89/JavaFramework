package day0429.ex08.Abstract;

public class MainPerson {

	public static void main(String[] args) {
		
		//상속 클래스 배열 데이터도 만들 수 있다.
		Person[] personArray = new Person[3];
//		personArray[0] = new Person("Hong", 20);	//error 추상클래스로 선언 : 객체를 만들 수 없다. 
		personArray[1] = new Student("Park", 20, "2019-001");
		personArray[2] = new Teacher("Lee", 25, "Music");
		
		for(int i=0; i<personArray.length;i++) {
			System.out.print((i+1)+".");
			personArray[i].printInfo();
		}
	}
}
