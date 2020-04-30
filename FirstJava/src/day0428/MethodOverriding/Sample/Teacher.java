package day0428.MethodOverriding.Sample;

public class Teacher extends Person{

	private String lesson;
	
	public Teacher() {
	}
	
	public Teacher(String name, int age, String lesson) {
		super(name, age);
		this.lesson = lesson;
	}

	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	public void printInfo() {
		System.out.print("이름=" + getName()); //public한 
		System.out.println(" 나이=" + getAge());
		System.out.println(" 과목=" + lesson);
	}
}
