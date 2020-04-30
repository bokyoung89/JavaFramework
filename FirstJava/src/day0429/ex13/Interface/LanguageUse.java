package day0429.ex13.Interface;

public class LanguageUse implements Language{
	
	private String lesson;
	
	public LanguageUse(String lesson) {
		this.lesson = lesson;
	}
	
	public void speak() {
		System.out.println(lesson + "을(를) 말하다.");
	}
	
	public void write(){
		System.out.println(lesson + "을(를) 쓰다.");
	}
	
	public void listen(){
		System.out.println(lesson + "을(를) 듣다.");
	}
	
	public void read(){
		System.out.println(lesson + "을(를) 읽다.");
	}

}
