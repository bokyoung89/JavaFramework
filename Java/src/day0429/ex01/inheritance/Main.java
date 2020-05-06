package day0429.ex01.inheritance;

public class Main {

	public static void main(String[] args) {
		Clothes c = new Clothes("야상패딩", "white", "버커루");
		c.printInfo();
		
		Shirt s1 = new Shirt("코튼/린넨 셔츠", "blue", "마인드 브릿지", "긴소매", "L");
		s1.printInfo();
		
		Pants p1 = new Pants("링클프리 팬츠", "Black", "지오다노", "긴바지");
		p1.printInfo();
	}

}
