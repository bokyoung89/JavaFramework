package day0424.example3;

public class MainPerson {

	public static void main(String[] args) {
		
		//명시적 초기화
		Person p1 = new Person();
		p1.printInfo();
		
		//생성자 초기화 (가장 마지막에 초기화하는 역할)
		 String name = "Lee";
		 char sex = 'M';
		 int age = 20;
		 float height = 190.5f;
		 boolean marridgeYn = true;
		 Person p2 = new Person(name, sex, age, height, marridgeYn);
		 p2.printInfo();

	}

}
