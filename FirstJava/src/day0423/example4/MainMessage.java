package day0423.example4;

public class MainMessage {

	public static void main(String[] args) {
		
		//생성자 오버로드 : 
		Message m1 = new Message("Welcome");
		m1.printInfo();
		m1.setMessage("Hello");
		m1.printInfo();
		
		Message m2 = new Message();	//에러 : Message() 디폴트 생성자가 없음
		m2.setMessage("Good");
		m2.printInfo();
	}
}
