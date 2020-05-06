package day0506.ex6.Api;

public class String1 {

	public static void main(String[] args) {
		
		/*	String 클래스
		*	1. 일련의 문자들의 집합을 처리한다.
		*	2. String 객체의 내용은 변경될 수 없다.
		*	3. String 객체의 내용을 읽거나 변경할 수 있도록 메소드를 제공한다.(위치 검색, 내용 비교, 추출 등)
		*	4. 컴파일러는 ""를 만나면 자동으로 String 객체로 변환한다.
		*	5. 다른 데이터 형으로 변환이 가능
		*/
		String str1 = "ABCD";
		String str2 = "abcd";
		String str3 = "Good Morning";
		
		// ### 검색 ###
		
		// ===== length =====
		System.out.println("===== 검색 =====");
		System.out.println("length()" + str1.length());	//문자열 길이 검색
		System.out.println("" + str1.contains("D"));	//문자열 포함 검색
		
		//### 추출 ###
		System.out.println("===== 추출 =====");
		// ===== charAt(index) =====
		// charAt() : 인덱스 위치의 글자 추출
		System.out.println("charAt(1)" + str1.charAt(1));
		//===== substring(index1, index2) =====
		// substring() : index1 ~ (index2-1)까지의 글자 추출
		System.out.println("substring(0,2)" + str1.substring(0,2));
		System.out.println("substring(2)=" + str1.substring(2)); //인덱스 2번부터 끝까지 추출
		System.out.println("substring(length()-3,length())=" 
				+ str1.substring(str1.length()-3, str1.length()));
		
		// ### 비교 ###
		System.out.println("===== 비교 =====");
		
		// ===== equals() =====
		//equals() : 대소문자 구분하여 비교
		System.out.println("equals=" + str1.equals(str2));
		
		// ===== equalsignoreCase() =====
		//대소문자 구분하지 않고 비교
		System.out.println("equalsignoreCase=" 
		+ str1.equalsIgnoreCase(str2));
		
		//### 제거 ###
		System.out.println("===== 제거 =====");
		
		// ===== trim() =====
		//trim() : String 앞, 뒤 space 제거
		System.out.println("trim()=[" + str3.trim() + "]");
		
		//### 생성 ###
		System.out.println("===== 생성 =====");
		
		// ===== concat() =====
		//concat() : 문자열 끝에 다른 문자열을 붙인다.
		System.out.println("concat=" + str1.concat("!!!"));	
	}
}
