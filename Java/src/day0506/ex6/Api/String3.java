package day0506.ex6.Api;

import java.util.StringTokenizer;

public class String3 {

	public static void main(String[] args) {
		
		//====== 기본 사용 ======
		String string = "id.name.password.email";
		
		StringTokenizer st = new StringTokenizer(string, ","); //a와 b 시스템이 서로 데이터를 받을 때 사용
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("token=" + token);
		}
		
		String[] stringArray = string.split(",");
		for(int i = 0; i<stringArray.length; i++) {
			System.out.println("stringArray[" + i + "]" + stringArray[i]);
		}
	}
}
