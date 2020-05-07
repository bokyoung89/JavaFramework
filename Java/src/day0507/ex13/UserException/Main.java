package day0507.ex13.UserException;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main.main()::Start");
		
		try {
			Service b = new Service();
			b.method();
		} catch(MyException e) {
			System.out.println("Main.main()::catch::MyException");
		} 
	System.out.println("Main.main()::End");
	}
}