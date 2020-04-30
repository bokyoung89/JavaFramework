package day0423.example4;

public class Message {
	//Variable
	private String message;
	
	//Constructor : 변수 셋팅. 변수를 최초에 셋팅 (초기화)시킬 수 있다. 무조건 처음 객체가 만들어질 때 생성 
	// 생성자 구분 : 이름만이 아니라 이름+입력값으로.
	public Message(String message) {
		this.message = message;
		System.out.println("Constructor : Message(String message)");
	}
	
	public Message() {
		System.out.println("Constructor : Message()");
	}
	
	//Method
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void printInfo() {
		System.out.println("--------Message Information---------");
		System.out.println("Message=" + message);
	}
}
