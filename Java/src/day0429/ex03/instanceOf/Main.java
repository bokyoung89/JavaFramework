package day0429.ex03.instanceOf;

public class Main {

	public static void main(String[] args) {
		Employee em = new Employee("James", "2020-001");
		em.printInfo();
		Ceo c = new Ceo("Hong", "2010-001");
		c.order();
		Manager m = new Manager("Jang", "2017-001");
		m.copy();
		
		//### instanceOf ###
		Something something = new Something();
		System.out.println("========== something.do(A) ============");
		something.doA(c);
		something.doA(m);
		
		

	}

}
