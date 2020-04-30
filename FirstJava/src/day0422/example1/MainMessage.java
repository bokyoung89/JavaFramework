package day0422.example1;

public class MainMessage {
	//main에서 class의 변수와 메소드를 가져와서 이용
	public static void main(String[] args) {
		// 
		Message m1 = new Message();
//		int a1 = m1.a;
//		System.out.println(a1);
//		String s1 = m1.s;
//		System.out.println(s1);
		
		int age = m1.age;
		System.out.println(age);
		
		m1.setAge(25);
		int age1 = m1.getAge();
		System.out.println(age1);
		
		m1.print();
	}
}
