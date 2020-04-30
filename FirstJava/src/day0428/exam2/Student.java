package day0428.exam2;

public class Student extends Person{
					//키워드 : person 클래스 요소를 그대로 사용
	
//	private String name;
//	private int age;	//상속됐으므로 필요 없음
	
	private int hakbun;	//학번
	
	public Student() {
		System.out.println("Student.생성자()");
	}
	
	public Student(String name, int age, String hakhun) {
		//수퍼클래스 설정 : super(name, age)가 실행되지 않으면 super()가 실행된다. 무조건 실행
		super(name, age);
		
		//현재클래스 설정
		this.hakbun = hakbun;
		System.out.println("Student.생성자(String name, int age, String hakhun)");
	}

	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
}
