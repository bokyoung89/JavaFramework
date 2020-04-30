package day0429.ex03.instanceOf;

public class Something {
	
	public void doA(Employee e) {
		if(e instanceof Ceo) { //Object Casting
			
			Ceo c = (Ceo) e;
			c.order();
		
		} else if(e instanceof Manager) {  //Object Casting
			
			Manager m = (Manager) e;
			m.copy();
		} 
	}
}
