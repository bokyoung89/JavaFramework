package day0429.ex06.Final;

public class Main {
	
	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setName("Hong");
		user1.printInfo();
		
		User user2 = new User("Kim", "newId");
		user2.printInfo();
	}
}
