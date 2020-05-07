package day0507.ex11.Throws;

public class Service {
	
	public void method() throws ArrayIndexOutOfBoundsException {
		System.out.println("\t\tService.method()::Start");
		
		String[] stringArray = new String[3];
		stringArray[0] = "A";
		stringArray[1] = "B";
		stringArray[2] = "C";
		for(int i=0;i<4;i++) {
			System.out.println("\t\tstringArray[" + i +"]=" + stringArray[i]);
		}
		System.out.println("\t\tService.method()::End");	//안 찍힘
	}
}
//		System.out.println("\t\tService.method()::Start");
//		System.out.println("\t\tService.method()::End");
//		try {
//			String[] stringArray = new String[3];
//			stringArray[0] = "A";
//			stringArray[1] = "B";
//			stringArray[2] = "C";
//			for(int i=0;i<4;i++) {
//				System.out.println("\t\tstringArray[" + i +"]=" + stringArray[i]);
//			}
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("catch");
//		} finally {
//			System.out.println("finally");
//		}
//	}
//}
