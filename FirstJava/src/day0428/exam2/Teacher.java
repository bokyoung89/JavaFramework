package day0428.exam2;

public class Teacher extends Person{
	
//	private String name;
//	private int age;	//상속 받았으므로 필요없음. 
						//새로 추가된 lesson만 선언
	private String lesson;
	
	public Teacher() {
		System.out.println("Teacher.생성자()");
	}
	
	public Teacher(String name, int age, String lesson) {
		//슈퍼클래스 설정 : 상속의 경우, 입력하지 않으면 자동으로 입력값이 없는 슈퍼 생성자가 실행된다.
		super(name,age);
		
		//현재클래스 설정
		this.lesson = lesson;
		System.out.println("Teacher.생성자(String name, int age, String lesson)");
	}

	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

}
