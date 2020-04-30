package day0428.exam5;

public class MainPerson {

	public static void main(String[] args) {
		System.out.println("===== p1 =====");
		Person p1 = new Person();
		
		System.out.println("===== p2 =====");
		Person p2 = new Person("Lee");
		
		System.out.println("===== p3 =====");
		Person p3 = new Person(24);
		
		System.out.println("===== p4 =====");
		Person p4 = new Person("Lee", 24);
		
		}
}
