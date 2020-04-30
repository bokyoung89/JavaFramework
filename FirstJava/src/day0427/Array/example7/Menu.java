package day0427.Array.example7;

public class Menu {
	
	private String menu;
	private int price;

	public Menu(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void printInfo() {
//		for(int i=0; i<order[].length; i++) {
//			System.out.print(i);
//			}
		System.out.println("메뉴=" + menu + "가격=" + price);
	}
}
