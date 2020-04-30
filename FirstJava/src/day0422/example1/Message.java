package day0422.example1;

public class Message {
	//=== 변수 ===
	int a = 10;
	String s = "안녕";
	int age = 30;
	
	//=== 메소드 === void는 return할 게 없음
	//### 메소드 : Setter ### 
	public void setAge(int i) {
		age = i;
		
	}
	//### 메소드 : getter ###
	//return : 메소드를 사용한 곳에  age를 전달하라.
	public int getAge() {
		return age;
	}
	//메소드
		public void print() {
			System.out.println("========시작========");
			System.out.println(a);
			System.out.println(s);
			System.out.println(age);
			System.out.println("========종료========");
		}
	}

