package day0508.ex01.BookStore;

public class MainBook {

	public static void main(String[] args) {
		
		Book[] bookArray = new Book[6];
		bookArray[0] = new Book("comic", "열혈강호", "양재현", "대원씨아이 ", 4500);
		bookArray[1] = new Book("novel", "뉴욕 100배 즐기기", "홍지윤", "알에이치코리아", 14400);
		bookArray[2] = new Book("novel", "삼국지(전집)", "나관중", "민음사 ", 72000);
		bookArray[3] = new Book("novel", "데미안", "헤르만 헤세", "더스토리", 12000);
		bookArray[4] = new Book("travel", "전국일주 가이드북", "지은이 ", "상상출판", 12500);
		bookArray[5] = new Book("travel", "바르셀로나", "정다운", "중앙북스", 15000);
		
		//BookStore
		BookStore bs = new BookStore(bookArray);
		System.out.println("========== printBookStore===========");
		bs.printBookStore();
		System.out.println("========== printBooksByCategory===========");
		String category = "travel";
		bs.printBooksByCategory(category);
		System.out.println("========== printBooksByMaxPrice===========");
		//maxPrice로 구매할 수 있는 도서 목록
		int maxPrice = 10000;
//		bs.printBooksByMaxPrice(MaxPrice);
		System.out.println("========== printBooksByMinPrice===========");
		//minPrice보다 가격이 높은 도서 목록
		int minPrice = 15000;
//		bs.printBooksByMaxPrice(MinPrice);
		
	}
}
