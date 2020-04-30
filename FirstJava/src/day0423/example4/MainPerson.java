package day0423.example4;

public class MainPerson {

	public static void main(String[] args) {
		
		//Type1 : 디폴트 생성자
		Person p1 = new Person();
		p1.setName("Park");
		p1.setAge(25);
		p1.printInfo();
		
		//Type2 : name only
		Person p2 = new Person("Jang");
		p2.setAge(25);
		p2.printInfo();
		
		//Type3 : age only
		Person p3 = new Person(30);
		p3.setName("Cha");
		p3.printInfo();
		
		//Type4 : all
		Person p4 = new Person("Lee",30);
		p4.printInfo();
	}
}
