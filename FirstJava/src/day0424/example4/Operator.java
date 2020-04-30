package day0424.example4;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Operator {

	public static void main(String[] args) {
		int j = 10;
		System.out.println("j=" + j);
		j = j + 1;
		System.out.println("j=" + j);
		
		int x = 10;
		System.out.println("x=" + x);
		x = x - 1;
		System.out.println("x=" + x);
		System.out.println();
		
		//### 증감 연산자(+) ###
		int i = 10;
		System.out.println("i=" + i);
		//값이 1 증가한다.
		i = i + 1;
		System.out.println("i=" + i);
		//값이 1 증가한다.
		i++;
		System.out.println("i=" + i);
		//값이 1 증가한다.
		++i;
		System.out.println("i=" + i);
		System.out.println();
		
		//### 증감 연산자(-) ###
		i = i - 1;
		System.out.println("i=" + i);
		i--;
		System.out.println("i=" + i);
		--i;
		System.out.println("i=" + i);
		System.out.println();
		
		//### OR 연산자 ###
		boolean A = true;
		boolean B = false;
		if(A|B) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		if(A||B) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println();
		
		// ======= |연산자  =========
		// 무조건 다 연산하고 실행
		int a = 1;
		int b = 1;
		int c = 1;
		System.out.println("a=" + a + " b=" + b + " c" + c);
		
		if(a++ <3 | b++ <3 | c++ <3) {
			System.out.println("참");
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			System.out.println("c=" + c);
		} else {
			System.out.println("거짓");
		}
		System.out.println();
		
		// ======= ||연산자  ==========
		// 로직을 확인하고 true이면 뒤의 값은 연산하지 않고 실행. 프로그램이 커질 때 성능 상 이슈 발생 가능.
		a = 1;
		b = 1;
		c = 1;
		System.out.println("a=" + a + " b=" + b + " c" + c);
		
		if(a++ <3 || b++ <3 || c++ <3) {
			System.out.println("참");
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			System.out.println("c=" + c);
		} else {
			System.out.println("거짓");
		}
		System.out.println();
		
		//### AND 연산자 ###
		if(A & B) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		if(A && B) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println();
		
		// ======= & 연산자  =========
		a = 1;
		b = 1;
		c = 1;
		System.out.println("a=" + a + " b=" + b + " c" + c);
		
		if(a++ <1 & b++ <1 & c++ <1) {
			System.out.println("참");
		} else {
			System.out.print("거짓");
			System.out.print(" a=" + a);
			System.out.print(" b=" + b);
			System.out.println(" c=" + c);
		}
		System.out.println();
		
		// ======= && 연산자  =========
		a = 1;
		b = 1;
		c = 1;
		System.out.println("a=" + a + " b=" + b + " c" + c);
		
		if(a++ <1 && b++ <1 && c++ <1) {
			System.out.println("참");
		} else {
			System.out.print("거짓");
			System.out.print(" a=" + a);
			System.out.print(" b=" + b);
			System.out.println(" c=" + c);
		}
		System.out.println();
	}
}
