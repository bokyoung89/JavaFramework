package day0428.exam7.copy;

public class MainPerson {

	public static void main(String[] args) {
		
//		### inheritance ###
//		변수 데이터 타입과 객체가 동일한 경우, 모든 메소드 사용 가능		
		
//		System.out.println("======Person======");
//		Person p = new Person("kim", 20);
//		p.printInfo();
//		
//		System.out.println("======Student======");
//		Student s = new Student("Park", 25, "2019-001");
//		s.printInfo();
//		
//		System.out.println("======Teacher======");
//		Teacher t = new Teacher("Hong", 30, "Music");
//		t.printInfo();
	
//		### Polymorphism ###
//		변수 데이터 타입과 객체가 같지 않은 경우, Casting(형변환)이 필요
		//====== Student ======
		Person ps = new Student("kim", 20, "2019-002");
		System.out.println("======Person======");
		System.out.print("이름=" + ps.getName());
		System.out.print(" 나이=" + ps.getAge());	
//		System.out.println(" 학번=" + ps.getHakbun());	//Errors
		
		Student p = (Student) ps;
		System.out.println("p.getHakbun()" + p.getHakbun());
		
	}
}
