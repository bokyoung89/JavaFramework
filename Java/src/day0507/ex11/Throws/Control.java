package day0507.ex11.Throws;

public class Control {
	
	public void method() throws ArrayIndexOutOfBoundsException{
		System.out.println("\tControl.method()::Start");
		
		Service s = new Service();
		s.method();
		
		System.out.println("\tControl.method()::End");
		
//		try {
//			Service s = new Service();
//			s.method();
//		} catch(ArrayIndexOutOfBoundsException e) {	//service throw하면 catch로 넘어옴
//			System.out.println("\t------catch : Control.method()");
//		} finally {
//			System.out.println("\t------finally : Control.method()");
//		}	
//		System.out.println("\tControl.method()::End");
	}
}
