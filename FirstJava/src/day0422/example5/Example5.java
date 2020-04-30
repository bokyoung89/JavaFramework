package day0422.example5;

public class Example5 {

	public static void main(String[] args) {
		//객체 생성
		User user1 = new User();
		
		//변수 셋팅
		user1.setId("sbk8689");
		user1.setName("신보경");
		user1.setEmail("sbk8689@gmail.com");
		user1.setGrade(1);
		user1.setMarridgeYn(false);
		
		//결과 출력
//		System.out.println("======== 회원 정보 ========");
//		System.out.println("아이디 :" + user1.getId());
//		System.out.println("이름 : " + user1.getName());	
//		System.out.println("이메일 : " + user1.getEmail());	
//		System.out.println("등급 : " + user1.getGrade());
//		System.out.println("결혼 여부 : " + user1.getMarridgeYn());

		user1.printInfo();
	}

}
