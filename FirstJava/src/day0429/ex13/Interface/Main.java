package day0429.ex13.Interface;

public class Main {
    /*
     * 추상 클래스 vs 인터페이스
     * - 인터페이스
     *    * 기능 정의서 (표준 작업 명세서)이다. - 강제성과 통일성
     *    * 설계 (선언)과 구현을 분리시키는 것을 가능하게 한다. (설계는 인터페이스에서 하고 구현은 자식 클래스에서 한다.)
     *    * 객체 생성 불가능. 객체 Type으로 사용 가능하다. (다형성 적용)
     *    * 인터페이스의 멤버는 상수, 추상 메소드만 올 수 있다. (abstract 생략 가능)
     *       단, static 메소드와 디폴트 메소드는 예외 (JDk 1.8부터)
     * - 인터페이스를 implement(=구현)한 자식 클래스에서 추상 메소드를 재정의한다.
     * 
     * 1. 인터페이스 작성
     * interface 인터페이스명 {
     *    // 상수
     *    public static final 데이터 타입 대문자 상수 = 값;
     * }
     * 
     * // 반환형 추상 메소드();
     * public 반황형 메소드명(매개변수1, 매개변수2...);
     * 
     * 2. 인터페이스 구현 : 인터페이스에 정의된 추상 메소드의 몸체를 정의한다는 의미
     * class 클래스명 implements 인터페이스명{
     *    @Override
     *    public 반환형 메소드명(매개변수1, 매개변수2...){
     *       // 인터페이스에 정의된 추상 메소드를 구현해야 한다.
     *    }
     * }
     * 
     * 3. 인터페이스 다중 상속 가능 cf) 클래스는 단일상속만 가능
     * interface 인터페이스명 extends 인터페이스명, 인터페이스명2
     * 
     * 4. 상속과 구현을 동시
     * class 클래스명 extends 부모 클래스명 implements 인터페이스1, 인터페이스2 {
     *    // 인터페이스에 정의된 추상 메소드를 구현해야 한다.
     *    }
     * 
     * 인터페이스는 상수와 추상 메소드로 구성
     * JDK 1.8 버전부터 static 메소드, default 메소드가 올 수 있다.
     * 
     * 상수 : 컴파일 과정에서 값이 변하지 않는 상수로 자동변환 된다. (public static final 생략 가능)
     * 
     */
	
//	===== 결과값 =====
//	English을(를) 말하다.
//	English을(를) 쓰다.
//	English을(를) 듣다.
//	English을(를) 읽다.
//	한국어을(를) 말하다.
//	한국어을(를) 쓰다.
//	한국어을(를) 듣다.
//	한국어을(를) 읽다.

	public static void main(String[] args) {
		LanguageUse langUse = new LanguageUse("English");
		langUse.speak();
		langUse.write();
		langUse.listen();
		langUse.read();
		
		Language lang = new LanguageUse("한국어");	//메소드 구현 자체가 오버라이딩이므로 가상메소드 호출 가능
		lang.speak();
		lang.write();
		lang.listen();
		lang.read();
	}
}
