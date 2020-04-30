package day0427.Array.example7;

public class MainMenu {

	public static void main(String[] args) {
		Menu[] order = new Menu[3];
		order[0] = new Menu("빅맥세트", 5500);
		order[1] = new Menu("아이스크림콘", 700);
		order[2] = new Menu("아이스커피", 1000);
		
		System.out.println("====[영수증]====");
		System.out.println("----주문 상세----");
		for(int i=0; i<order.length;i++) {
			order[i].printInfo();
		}
		System.out.println("----주문 금액 합계----");
		int total = 0; 
		for(int i=0; i<order.length;i++) { //배열 전체 길이를 뽑고
			int price = order[i].getPrice(); //
			total = total + price;
		}
		System.out.println(Util.getDecimalComma(total));
	}
}