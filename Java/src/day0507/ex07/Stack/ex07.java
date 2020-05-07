package day0507.ex07.Stack;

import java.util.Stack;

public class ex07 {

	public static void main(String[] args) {
		//선언 및 생성
		System.out.println("=== 생성 ===");
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("isEmpty()=" + stack.isEmpty());
		System.out.println("|size" + stack.size());
		//추가
		System.out.println("=== 추가 ===");
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		stack.push(new Integer(4));
		stack.push(new Integer(5));
		//검색
		System.out.println("=== 검색 ===");
		Integer integer = stack.peek();
		System.out.println("peek()" + integer);
		//삭제
		System.out.println("=== 삭제 ===");
		integer=stack.pop();
		System.out.println("pop()" + integer);
		integer = stack.peek();
		System.out.println("|peek" + integer);
		//전체 삭제
		System.out.println("=== 전체 삭제 ===");
		stack.clear();
		System.out.println("isEmpty()=" + stack.isEmpty());
	}

}
