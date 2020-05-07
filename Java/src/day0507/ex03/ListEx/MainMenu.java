package day0507.ex03.ListEx;

import java.util.ArrayList;

public class MainMenu {

	public static void main(String[] args) {
		
		//선언 및 생성
		ArrayList menuList1 = new ArrayList();
		//Add
		menuList1.add(new Coffee("아메리카노", 3000, "에티오피아 예가체프"));
		menuList1.add(new Coffee("카푸치노", 3500, "케냐 오클랜드"));
		menuList1.add(new Ade("레몬에이드", 4000, "레몬 시럽"));
		menuList1.add(new Ade("한라봉에이드", 4500, "한라봉"));
		Order order1 = new Order(menuList1);
		order1.printOrder();
		
		//==== 주문 2 ====
		ArrayList menuList2 = new ArrayList();
		menuList2.add(new Coffee("카푸치노", 3500, "케냐 오클랜드"));
		Order order2 = new Order(menuList2);
		order2.printOrder();
		
		ArrayList menuList3 = new ArrayList();
		menuList3.add(new Ade("레몬에이드", 4000, "레몬 시럽"));
		Order order3 = new Order(menuList3);
		order3.printOrder();
		
		ArrayList menuList4 = new ArrayList();
		menuList4.add(new Ade("한라봉에이드", 4500, "한라봉"));
		Order order4 = new Order(menuList4);
		order4.printOrder();
		

//		for(int i=0; i<menuList.size(); i++) {
//			System.out.print((i+1) + ".");
//			Object obj = menuList.get(i);
//			Menu menuObj = (Menu) obj;
//			menuObj.printInfo();
//		}
	}
}