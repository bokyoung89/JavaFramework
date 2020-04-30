package day0428.exam3;

public class MainMenu {

	public static void main(String[] args) {
		
		Menu m1 = new Menu();
		m1.setName("메뉴");
		m1.setPrice(100);
		System.out.println("======Menu======");
		System.out.print("메뉴=" + m1.getName());
		System.out.println(" 가격=" + m1.getPrice());
		
		coffee c1 = new coffee();
		c1.setName("아메리카노");
		c1.setPrice(3000);
		c1.setBeansName("에티오피아 예가체프");
		System.out.println("\n======Coffee======");
		System.out.print("메뉴=" + c1.getName());
		System.out.print(" 가격=" + c1.getPrice());
		System.out.println(" 원두명=" + c1.getBeansName());
		
		Ade a1 = new Ade();
		a1.setName("레몬에이드");
		a1.setPrice(4000);
		a1.setIngredient("레몬,시럽");
		System.out.println("\n===== Ade =====");
		System.out.print("메뉴=" + a1.getName());
		System.out.print(" 가격=" + a1.getPrice());
		System.out.println(" 재료=" + a1.getIngredient());
	}
}
