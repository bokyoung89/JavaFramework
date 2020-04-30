package day0423;

public class MainCalculator {

	public static void main(String[] args) {
		
		int value1 = 10;
		int value2 = 6;
		
		Calculator cal = new Calculator();
				
//		//리턴값 받아서 결과 출력
		int result1 = cal.plus(value1, value2);
		System.out.println(value1 + "+" + value2 + " = " + result1);
		
		int result2 = cal.minus(value1, value2);
		System.out.println(value1 + "-" + value2 + " = " + result2);
		
		int result3 = cal.multiply(value1, value2);
		System.out.println(value1 + "+" + value2 + " = " + result3);
		
		int result4 = cal.divide(value1, value2);
		System.out.println(value1 + "+" + value2 + " = " + result4);
		
		int result5 = cal.rest(value1, value2);
		System.out.println(value1 + "+" + value2 + " = " + result5);
		
		//리턴값 안 받고 결과 출력
		cal.printPlus(value1, value2);
		cal.printMinus(value1, value2);
		cal.printMultiply(value1, value2);
		cal.printDivide(value1, value2);
		cal.printRest(value1, value2);
		
		//getter, setter 메소드 만들고 결과 출력
		cal.setFirstValue(value1);
		cal.setSecondValue(value2);
		
		cal.printPlus2();
		cal.printMinus2();
		cal.printMultiply2();
		cal.printDivide2();
		cal.printRest2();
		cal.printInfo();
		cal.clear();

	}

}
