package day0424.IfElse;

public class If {

	public static void main(String[] args) {
		
		int age = 19;
		
		// if~ else문
		if(age > 19) {	
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
		
		// if~ else if문 
		age = 3;
		
		if(age > 19) {
			System.out.println("성인");
		} else if(age >=8) {
			System.out.println("학생");
		} else if(age >=3) {
			System.out.println("어린이");
		} else {
			System.out.println("아기");
		}
		
		// if ~ else if문 응용
		age = 20;
		boolean isWomen = true;
		
		if(age < 19) {
			System.out.println("미성년자");
		} else {
			if(isWomen == true) {
				System.out.println("성인여자");
			} else {
				System.out.println("성인남자");
			}
		}
		
		//성인 여자만 추출
		if((age >=19) & (isWomen == true)) {
			System.out.println("성인여자");
		}
	}
}