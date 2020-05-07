package day0507.ex09.Properties;

import java.util.Enumeration;
import java.util.Properties;

public class ex09 {
	//작업 환경을 알아볼 때 사용. 프로퍼티스 타입으로 객체를 생성한다. 
	public static void main(String[] args) {
		//System Properties
		Properties prop = System.getProperties();	//프로퍼티스 타입으로 객체 
		//전체 출력
		System.out.println("========== 전체 출력 ===========");
		Enumeration e = prop.propertyNames();
		while(e.hasMoreElements()) {	//내가 확인할 데이터가 더 있느냐?
			String element = (String)e.nextElement();
			System.out.println(element + "=" + prop.getProperty(element));
		}		
	}
}