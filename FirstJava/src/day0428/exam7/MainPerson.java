package day0428.exam7;

public class MainPerson {

	public static void main(String[] args) {
		
//		### inheritance ###
//		변수 데이터 타입과 객체가 동일한 경우, 모든 메소드 사용 가능		
		
//		Person p = new Person("Kim", 20);
//		System.out.println("======Person======");
//		System.out.print("이름=" + p.getName());
//		System.out.println(" 나이=" + p.getAge());
//	
//		Student s = new Student("Park", 25, "2019-001");
//		System.out.println("======Student======");
//		System.out.print("이름=" + s.getName());
//		System.out.print(" 나이=" + s.getAge());
//		System.out.println(" 학번=" + s.getHakbun());
//
//		Teacher t = new Teacher("Hong", 40, "English");
//		System.out.println("======Teacher======");
//		System.out.print("이름=" + t.getName());
//		System.out.print(" 나이=" + t.getAge());
//		System.out.print(" 과목=" + t.getLesson());
		
//		### Polymorphism ###
//		변수 데이터 타입과 객체가 같지 않은 경우, Casting(형변환)이 필요
		
		//====== Student ======
//		변수 데이터 타입과 객체가 같지 않은 경우, Casting(형변환)이 필요
		Person ps = new Student("Kim", 20, "2019-001"); //하위 인스턴스를 상위 인스턴스에 넣어준 뒤
		System.out.println("======Person======");
		System.out.print("이름=" + ps.getName());
		System.out.println(" 나이=" + ps.getAge());	
//		System.out.println(" 학번=" + ps.getHakbun());
		
		//===== Object Casting =====
//		변환하려는 메소드명 Object Casting 레퍼런스의 성격을 바꿔주는 작업. 다른 언어에서는  convert 작업 (데이터 변환)
		Student s = (Student) ps; //하위 클래스로 형 변환하여 넣어줘야 함.
		System.out.println("s.getHakbun()" + s.getHakbun());

		//====== Teacher ======
		Person pt = new Teacher("Hong", 40, "English");
		System.out.println("======Teacher======");
		System.out.print("이름=" + pt.getName());
		System.out.println(" 나이=" + pt.getAge());	
//		System.out.println(" 과목=" + pt.getLesson()); //Error : getLesson은 Teacher의 
		
		//===== Object Casting =====
		Teacher t = (Teacher) pt;
		System.out.println("t.getLesson()" + t.getLesson());
		
//		### 가상 메소드 호출 virtual method invocation ###
//		오버라이드된 메소드가 존재할 경우 reference variable 타입 상관없이 마지막으로 오버라이드 된 메소드가 호출된다.
		
//		Person p = new Person("Jenna", 25);
//		p.printInfo();
		
//		ps1은 student 클래스에서 생성된 메소드를 호출 할 수 없다. 그러나 오버라이드된 메소드 경우 student 클래스에서 생성된 메소드가 호츨된다.
		Person ps1 = new Student("Harry", 30, "2020-03");
		ps1.printInfo();
		
		Person pt1 = new Teacher("Harry", 50, "Math");
		pt1.printInfo();
		
		
		
		
	}
}
