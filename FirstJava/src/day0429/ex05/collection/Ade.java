package day0429.ex05.collection;

public class Ade extends Menu {

	private String ingredient;
	
	public Ade(String name, int price, String ingredient) {
		super(name, price);
		this.ingredient = ingredient;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	
	public void printInfo() {
		System.out.print("메뉴=" + getName());	
		System.out.print(" | 가격=" + getPrice());
		System.out.println(" | 재료=" + ingredient);
	}
	
	
}
