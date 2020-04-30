package day0428.exam7.copy;

public class Teacher extends Person {
	
	String lesson;
	
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
		System.out.print("이름=" + getName());
		System.out.print(" 나이=" + getAge());
		System.out.println(" 과목=" + lesson);
	}
}
