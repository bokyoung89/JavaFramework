package day0507.ex11.Throws;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main.main()::Start");
		try {
			Control c = new Control();
			c.method();
	} catch(ArrayIndexOutOfBoundsException e) {	//control throw하면 catch로 넘어옴
		System.out.println("\t------catch : Main.method()");
	} finally {
		System.out.println("\t------finally : Main.method()");
	}	
	System.out.println("Main.main()::Start");
	}
}
