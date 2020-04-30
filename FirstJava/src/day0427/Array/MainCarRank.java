package day0427.Array;

public class MainCarRank {

	public static void main(String[] args) {
		
		//initializer
		String cardRanks[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		for(int i=0; i<cardRanks.length; i++) {
			System.out.println("cardRanks[" + i + "]" + cardRanks[i]);
		}
		
		//배열 선언과 생성을 한 줄에
		String[] cardRanks1 = new String[13];
		cardRanks1[0] = "1";
		cardRanks1[1] = "2";
		cardRanks1[2] = "3";
		cardRanks1[3] = "4";
		cardRanks1[4] = "5";
		cardRanks1[5] = "6";
		cardRanks1[6] = "7";
		cardRanks1[7] = "8";
		cardRanks1[8] = "9";
		cardRanks1[9] = "10";
		cardRanks1[10] = "Jack";
		cardRanks1[11] = "Queen";
		cardRanks1[12] = "King";
		System.out.println();
		for(int i=0; i<cardRanks1.length; i++) {
			System.out.println("cardRanks1[" + i + "]" + cardRanks1[i]);
		}
	}
}
