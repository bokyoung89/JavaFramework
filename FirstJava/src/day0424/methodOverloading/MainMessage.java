package day0424.methodOverloading;

public class MainMessage {

	public static void main(String[] args) {
		Message msg = new Message();
		
		msg.say();
		msg.say("Hello");
		msg.say(50);
		msg.say("World", 60);
		msg.say(60, "World");
	}

}
