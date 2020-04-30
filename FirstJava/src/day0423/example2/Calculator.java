package day0423.example2;

public class Calculator {
	
	//리턴값 있는 메소드
	public int plus(int firstValue, int secondValue) {
		int result = firstValue + secondValue;
		return result;
	}
	public int minus(int firstValue, int secondValue) {
		int result = firstValue - secondValue;
		return result;
	}
	public int multiply(int firstValue, int secondValue) {
		int result = firstValue * secondValue;
		return result;
	}
	public int divide(int firstValue, int secondValue) {
		int result = firstValue / secondValue;
		return result;
	}
	public int rest(int firstValue, int secondValue) {
		int result = firstValue % secondValue;
		return result;
	}
	
	//리턴값 없는 메소드
	public void printPlus(int firstValue, int secondValue) {
		int result = firstValue + secondValue;
		System.out.println("plus()::" + firstValue + "+" + secondValue + "=" + "[" + result + "]");	
	}
	
	public void printMinus(int firstValue, int secondValue) {
		int result = firstValue - secondValue;
		System.out.println("minus()::" + firstValue + "-" + secondValue + "=" + "[" + result + "]");
		
	}
	public void printMultiply(int firstValue, int secondValue) {
		int result = firstValue * secondValue;
		System.out.println("multiply()::" + firstValue + "*" + secondValue  + "=" + "[" + result + "]");
		
	}
	public void printDivide(int firstValue, int secondValue) {
		int result = firstValue / secondValue;
		System.out.println("divide()::" + firstValue + "/" + secondValue  + "=" + "[" + result + "]");
		
	}
	public void printRest(int firstValue, int secondValue) {
		int result = firstValue % secondValue;
		System.out.println("rest()::" + firstValue + "%" + secondValue  + "=" + "[" + result + "]");
		
	}
	
	//getter, setter 메소드 만들고 결과 출력
	private int firstValue;
	private int secondValue;
	
	public int getFirstValue() {
		return firstValue;
	}
	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}
	public int getSecondValue() {
		return secondValue;
	}
	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}

	public void printPlus2() {
		int result = firstValue + secondValue;
		System.out.println("printPlus2()::" + firstValue + "+" + secondValue + "=" + "[" + result + "]");	
	}
	public void printMinus2() {
		int result = firstValue - secondValue;
		System.out.println("printMinus2()::" + firstValue + "-" + secondValue + "=" + "[" + result + "]");	
	}
	public void printMultiply2() {
		int result = firstValue * secondValue;
		System.out.println("printMultiply2()::" + firstValue + "*" + secondValue + "=" + "[" + result + "]");	
	}
	public void printDivide2() {
		int result = firstValue / secondValue;
		System.out.println("printDivide2()::" + firstValue + "/" + secondValue + "=" + "[" + result + "]");	
	}
	public void printRest2() {
		int result = firstValue % secondValue;
		System.out.println("printRest2()::" + firstValue + "%" + secondValue + "=" + "[" + result + "]");	
	}
	public void printInfo() {
		System.out.println("firstValue=[" + firstValue + "]");
		System.out.println("secondValue=[" + secondValue + "]");
	}
	public void clear() {
		//setFirstValue(0);
		firstValue = 0;
		System.out.println("firstValue=[" + firstValue + "]");
		
		//setSecondValue(0);
		secondValue = 0;
		System.out.println("secondValue=[" + secondValue + "]");
	}

}
