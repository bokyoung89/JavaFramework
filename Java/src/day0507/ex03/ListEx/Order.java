package day0507.ex03.ListEx;

import java.util.ArrayList;

public class Order {
	
	private ArrayList menulist;
	private static int orderNo;	//주문번호
	
	public Order(ArrayList menulist) {
		this.menulist = menulist;
		orderNo = orderNo +1;
	}

	public ArrayList getMenulist() {
		return menulist;
	}

	public void setMenulist(ArrayList menulist) {
		this.menulist = menulist;
	}

	public static int getOrderNo() {
		return orderNo;
	}

	public static void setOrderNo(int orderNo) {
		Order.orderNo = orderNo;
	}

	public void printOrder() {
		System.out.println("=== [주문서] ===");
		
		System.out.println("주문번호 :" + orderNo);
		
		int totalPrice = 0;
		for(int i=0; i<menulist.size(); i++) {
			System.out.print("\t" + (i+1) + ".");
			Object obj = menulist.get(i);
			Menu menu = (Menu) obj;
			menu.printInfo();
			totalPrice = totalPrice + menu.getPrice();//어차피 돌려서 합계 계산할거 한번에 하자!
		}
		System.out.println("주문액" + DecimalUtil.getDecimalComma(totalPrice));
		System.out.println("주문건수" + menulist.size());
		System.out.println("주문시간" + DateUtil.thisTimeToDotDate());
	}
}
