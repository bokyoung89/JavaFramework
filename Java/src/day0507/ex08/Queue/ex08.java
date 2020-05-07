package day0507.ex08.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ex08 {

	public static void main(String[] args) {
		System.out.println(" 생성 ");
		Queue<Integer> queue = new LinkedList<Integer>();
		System.out.println("isEmply()=" + queue.isEmpty());
		System.out.println("isEmply()=" + queue.isEmpty());
		System.out.println("|size()=" + queue.size());
		
		//추가
		System.out.println(" 추가 ");
		queue.offer(new Integer(1));
		queue.offer(new Integer(2));
		queue.offer(new Integer(3));
		queue.offer(new Integer(4));
		queue.offer(new Integer(5));
		
		//검색
		System.out.println(" 검색 ");
		Integer integer = queue.peek();
		System.out.println("peek()=" + integer);
		
		//삭제
		System.out.println(" 삭제 ");
		integer = queue.poll();
		System.out.println("poll()=" + integer);
		integer = queue.peek();
		System.out.println("|peek()=" + integer);
		
		//전체 삭제
		queue.clear();
		System.out.println("isEmpyt()=" + queue.isEmpty());
	}

}
