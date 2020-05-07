package day0507.ex12.Exception;

public class Service {
	
	public static void main(String[] args) {
		System.out.println("\t\tService.method()::Start");
		
		String[] stringArray = new String[3];
		stringArray[0] = "A";
		stringArray[1] = "B";
		stringArray[2] = "C";
		String string = new String("World");
		try {
			//ArrayIndexOutOfBoundsException
			for(int i=0;i<4;i++) {
				System.out.println("\t\tstringArray[" + i +"]=" + stringArray[i]);
			}
			//StringIndexOutOfBoundsException
			System.out.println(string.charAt(5));
			
	} catch(StringIndexOutOfBoundsException e) {
		System.out.println("---- catch : StringIndexOutOfBoundsException ----");	//여러 개 될 수 있는데 해당되는 것만 실행
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("---- catch : ArrayIndexOutOfBoundsException ----");
	} catch(IndexOutOfBoundsException e) {
		System.out.println("---- catch : IndexOutOfBoundsException ----");
	} catch(Exception e) {		//catch에서 상속 적용
		System.out.println("---- catch : Exception ----");
	} finally {
		System.out.println("=======finally========");
	}
	}
}



