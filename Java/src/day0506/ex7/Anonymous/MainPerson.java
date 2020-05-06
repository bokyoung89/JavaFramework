package day0506.ex7.Anonymous;

public class MainPerson {

	public static void main(String[] args) {
		
//		Person p = new Person("Lee", 30);
//		p.printInfo();
//		
//		Student s = new Student("Hong", 25, "2020-001");
//		s.printInfo();
		
		//Anonymous Class : person 클래스의 서브 클래스가 된다. 일회성으로 쓸때 사용 ex) 버튼, 셀렉트
		Person p = new Person("James", 20) {
			private String hakbun = "2020-001";
			public String getHakbun() {
				return hakbun;
			}
			public void setHakbun(String hakbun) {
				this.hakbun = hakbun;
			}
			//Override
			public void printInfo() {
				System.out.print("이름=" + getName());
				System.out.print(" 나이=" + getAge());
				System.out.println(" 학번=" + hakbun);
			}
		};
		
		//Person 클래스 메소드
		p.getName();
		p.getAge();
		
		//Anonymous 클래스 메소드
		//p.getHakbun();	//Error 레퍼런스가  Person 타입으로 선언되어 
		//p.setHakbun();	//Error 레퍼런스가  Person 타입으로 선언되어
		//Override 메소드
		p.printInfo(); //Person 클래스 메소드. 따라서 호출 가능.
	}
}
