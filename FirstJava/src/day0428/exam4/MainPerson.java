package day0428.exam4;

import java.lang.reflect.Method; //ctrl+shift+o 임포트 단축키

public class MainPerson {

	public static void main(String[] args) {
		Person p = new Person();
		String superClassName = p.getClass().getSuperclass().getName();
		System.out.println("SuperClass=" + superClassName);
		
		//현재 클래스가 가지고 있는 메소드 전체 목록
		Method[] method2 = p.getClass().getMethods(); 
		System.out.println("\n ### getMethods ####");
		for(int i=0;i<method2.length;i++) {
			String methodName = method2[i].getName();
			System.out.println("method-[" + i + "]" + methodName);
		}
		
		// 클래스에서 선언한 메소드 목록
		Method[] method1 = p.getClass().getDeclaredMethods(); 
		System.out.println("\n ### getDeclaredMethods ####");
		for(int i=0;i<method1.length;i++) {
			String methodName = method1[i].getName();
			System.out.println("method-[" + i + "]" + methodName);
		}
	}
}
