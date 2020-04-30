package day0429.ex02.instanceOf;

public class MainPerson {

	public static void main(String[] args) {
		Person p = new Person("Lee", 30);
		Student s = new Student("Park", 20, "2019-001");
		Teacher t = new Teacher("Lee", 25, "Music");
		
		Something something = new Something();
//		System.out.println("============something.doA()==============");
//		something.doA(p);
//		something.doA(s);
//		something.doA(t);
		
		System.out.println("======== something.printInfo()=========");
		something.printInfo(p);
		something.printInfo(s);
		something.printInfo(t);
	}
}
