package day0427.Static;

public class Person {
	private String name;
	private int no;
	private static int sum; 
	/* Static 변수 
	 * -클래스 로딩 시점에서 객체에 상관없이 자동으로 메모리에 생성. 공용 변수처럼 따로 관리된다.
	 * -객체 생성 없이 클래스 명으로 접근 가능.
	 * -간단하게 필요한 요소 (산술식, 수식) ex) Math.random();
	 */
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
		no = no + 1;
		sum = sum + 1; //값이 계속 누적된다.
	}
	
	public void printInfo() {
		System.out.println("\n------Person 정보------");
		System.out.print("이름=[" + name + "]");
		System.out.print("번호=[" + no + "]");
		System.out.print("합계=[" + sum + "]");
	}
	public void sayHello() {
		System.out.println("안녕하세요.");
	}
	public static void sayWelcome() {
		System.out.println("안녕하세요.");
	}
	// static 메소드
	public static void printInfoStatic() {
		// ---- 멤버 변수 ---
		// System.out.print("이름=[" + name + "]"); //error : name은 static 요소가 아님.
		// System.out.print("번호=[" + no + "]"); //error : no은 static 요소가 아님.
		System.out.print("합계=[" + sum + "]"); //멤버변수는  static만 쓸 수 있다.
		
		// ---- 지역 변수 ----
		//static 메소드 내 지역변수 사용 가능
		int data1 = 10;
		System.out.println("데이터1=" + data1);
		//static 메소드 내 지역변수에는 static 시용할 수 없다.
//		static int data2 = 10; //error
		//System.out.println("데이터2=" + data2);
		
	}

}
