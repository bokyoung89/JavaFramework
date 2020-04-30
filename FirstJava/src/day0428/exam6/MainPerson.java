package day0428.exam6;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Kim");
		p.setAge(28);
		System.out.println("======Person======");
		System.out.print("이름=" + p.getName());
		System.out.println(" 나이=" + p.getAge());
		
		Student s = new Student();
		s.setName("Lee");
		s.setAge(25);
		s.setHakbun(2019001);
		System.out.println("======Student======");
		System.out.print("이름=" + s.getName());
		System.out.print(" 나이=" + s.getAge());
		System.out.println(" 학번=" + s.getHakbun());
		
		Teacher t = new Teacher();
		t.setName("Hong");
		t.setAge(20);
		t.setLesson("music");
		System.out.println("======Teacher======");
		System.out.print("이름=" + t.getName());
		System.out.print(" 나이=" + t.getAge());
		System.out.print(" 과목=" + t.getLesson());
	}

}
