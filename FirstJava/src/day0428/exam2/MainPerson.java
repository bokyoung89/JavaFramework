package day0428.exam2;

public class MainPerson {

	public static void main(String[] args) {
		
//		Person p = new Person();
//		p.setName("Kim");
//		p.setAge(28);
//		System.out.println("======Person======");
//		System.out.print("이름=" + p.getName());
//		System.out.println(" 나이=" + p.getAge());
//		
//		Student s = new Student();
//		s.setName("Lee");
//		s.setAge(25);
//		s.setHakbun(2019001);
//		System.out.println("======Student======");
//		System.out.print("이름=" + s.getName());
//		System.out.print(" 나이=" + s.getAge());
//		System.out.println(" 학번=" + s.getHakbun());
//		
//		Teacher t = new Teacher();
//		t.setName("Hong");
//		t.setAge(20);
//		t.setLesson("music");
//		System.out.println("======Teacher======");
//		System.out.print("이름=" + t.getName());
//		System.out.print(" 나이=" + t.getAge());
//		System.out.print(" 과목=" + t.getLesson());
//		System.out.println();
		
//		System.out.println("======Person 생성자======");
//		Person p1 = new Person();
//		Person p2 = new Person("Kim", 20);
//		
//		System.out.println("======Student 생성자======");
//		Student s1 = new Student();
//		Student s2 = new Student("Park", 25, "2019-001");
//		System.out.println(s2.getName());
//		System.out.println(s2.getAge());
//		System.out.println(s2.getHakbun());
		
		System.out.println("======Teacher 생성자======");
//		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher("Park", 25, "music");
		System.out.println(t2.getName());
		System.out.println(t2.getAge());
		System.out.println(t2.getLesson());
		
	}

}
