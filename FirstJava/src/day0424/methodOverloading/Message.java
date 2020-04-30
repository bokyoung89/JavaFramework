package day0424.methodOverloading;

public class Message {
	
	public Message() {
		
	}
	//Method
	public void say() {
		System.out.println("say()");
	}
	public void say(String input1) {
		System.out.println("Say(String input1) :" + input1);
	}
	public void say(int input1) {
		System.out.println("Say(int input1) :" + input1);
	}
	public void say(String input1, int input2) {
		System.out.println("Say(String input1, int input2) :" + input1 + input2);
	}
	public void say(int input1, String input2) {
		System.out.println("Say(int input1, String input2) :" + input1 + input2);
	}
}
