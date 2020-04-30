package day0429.ex05.collection;

public class MainMenu {

	public static void main(String[] args) {
		
		Menu[] menuArray = new Menu[3];
		menuArray[0] = new Coffee("아메리카노", 3000, "에티오피아 예가체프");
		menuArray[1] = new Coffee("카푸치노", 3500, "케냐 오클랜드");
		menuArray[2] = new Ade("레몬에이드", 4000, "레몬 시럽");
		
		for(int i=0; i<menuArray.length;i++) {
			menuArray[i].printInfo();
		}
	}
}
