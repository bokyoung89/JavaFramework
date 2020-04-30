package day0428.MethodOverriding.Sample;

public class MainPerson {

	public static void main(String[] args) {
		
		System.out.println("======Person======");
		Person p = new Person("Lee", 30);
		p.printInfo();
		
		System.out.println();

		System.out.println("======Student======");
		Student s = new Student("Park", 20, "2019-001");
		s.printInfo();
		
		System.out.println();
		
		System.out.println("======Teacher======");
		Teacher t = new Teacher("Lee", 25, "Music");
		t.printInfo();
	}
}
