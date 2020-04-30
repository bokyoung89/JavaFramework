package day0423;

public class Calculator {
	
	public int plus(int value1, int value2) {
		int result = value1 + value2;
		return result;
	}
	
	public int minus(int value1, int value2) {
		int result = value1 - value2;
		return result;
	}
	
	public int multiply(int value1, int value2) {
		int result = value1 * value2;
		return result;
	}
	
	public int divide(int value1, int value2) {
		int result = value1 / value2;
		return result;
	}
	
	public int rest(int value1, int value2) {
		int result = value1 % value2;
		return result;
	}
	
	public void printPlus(int value1, int value2) {
		int result = value1 + value2;
		System.out.println(value1 + "+" + value2 + " = " + result);
	}
	
	public void printMinus(int value1, int value2) {
		int result = value1 - value2;
		System.out.println(value1 + "-" + value2 + " = " + result);
	}
	
	public void printMultiply(int value1, int value2) {
		int result = value1 * value2;
		System.out.println(value1 + "*" + value2 + " = " + result);
	}
	
	public void printDivide(int value1, int value2) {
		int result = value1 / value2;
		System.out.println(value1 + "/" + value2 + " = " + result);
	}
	
	public void printRest(int value1, int value2) {
		int result = value1 % value2;
		System.out.println(value1 + "%" + value2 + " = " + result);
	}

	private int FirstValue;
	private int SecondValue;
	
	public int getFirstValue() {
		return FirstValue;
	}

	public void setFirstValue(int firstValue) {
		FirstValue = firstValue;
	}

	public int getSecondValue() {
		return SecondValue;
	}

	public void setSecondValue(int secondValue) {
		SecondValue = secondValue;
	}
	
	public void printPlus2() {
		int result = FirstValue + SecondValue;
		System.out.println("printPlus2 : " + result);
	}
	public void printMinus2() {
		int result = FirstValue + SecondValue;
		System.out.println("printMinus2 : " + result);
	}
	public void printMultiply2() {
		int result = FirstValue + SecondValue;
		System.out.println("printMultiply2 : " + result);
	}
	public void printDivide2() {
		int result = FirstValue + SecondValue;
		System.out.println("printDivide2 : " + result);
	}
	public void printRest2() {
		int result = FirstValue + SecondValue;
		System.out.println("printRest2 : " + result);
	}
	public void printInfo() {
		System.out.println("FirstValue : " + FirstValue);
		System.out.println("SecondValue : " + SecondValue);
	}
	public void clear() {
		FirstValue = 0;
		SecondValue = 0;
		System.out.println("FirstValue : " + FirstValue);
		System.out.println("SecondValue : " + SecondValue);
	}
	
	
	
	
	
	
	
}
