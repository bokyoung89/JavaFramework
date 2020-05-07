package day0507.ex10.Exception;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckedException {
	
	/* Checked Exception VS Unchecked Exception
	 * ## Unchecked Exception ##
	 * 1.컴파일은 되고 실행은 안된다.
	 * 2.RuntimeException, Error
	 * 3.프로그래미에 실수에 의한 경우가 대부분. 적절히 try/catch 처리가 필요
	 * 
	 * ## checked Exception ##
	 * 1.컴파일 되지 않는다.
	 * 2.사용자의 잘못으로 발생
	 * 3. 
	 */

	public static void main(String[] args) {
//		//Code 1  컴파일 에러 발생 --> Code 2로 해결
//		InetAddress ia;
//		ia = InetAddress.getByName("www.naver.com");
//		System.out.println("ia=[" + ia + "]");
		
		//Code2
		InetAddress ia;
		try {
			ia = InetAddress.getByName("www.naver.com");
			System.out.println("주소 정보=" + ia);
		} catch(UnknownHostException e) {
			System.out.println("========== catch ==========");
		} finally {
		System.out.println("========== finally() ==========");	
		}
	}
}
