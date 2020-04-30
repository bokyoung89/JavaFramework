package day0429.ex02.instanceOf;

public class Something {
	
	public void doA(Person p) {
		
		/* #### instance of ####
		 *	- 상속 관계에 의한 객체가 입력값으로 들어왔을 때 어떤 클래스에서 온 건지 구분짓기 위해 사용
		 *	- 상속 관계를 고려해서 써야 함. 무조건 슈퍼클래스가 나오면 처음부터 필터링된다.
		 */
		
		if(p instanceof Student) {
			System.out.println("Student");
		} else if(p instanceof Teacher) {
			System.out.println("Teacher");
		} else if(p instanceof Person) {
			System.out.println("Person");
		}
	}
	
	public void printInfo(Person p) {
		if(p instanceof Student) {
			
			Student s = (Student) p;
			String hakbun = s.getHakbun();
			
			System.out.print("[Student]");
			System.out.println("학번 " + hakbun);
			
		} else if(p instanceof Teacher) {
			
			Teacher t = (Teacher) p;
			String lesson = t.getLesson();
		
			System.out.print("[Teacher]");
			System.out.println("과목" + lesson);
			
		} else if(p instanceof Person) {
			
			String name = p.getName();
			int age = p.getAge();
			
			System.out.print("[Person]");
			System.out.println("이름" +  name);
			System.out.println("나이" +  age);
		}
	}
}
