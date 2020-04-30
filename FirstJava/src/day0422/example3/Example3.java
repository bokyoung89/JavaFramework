package day0422.example3;

public class Example3 {

	public static void main(String[] args) {

		// === 변수 직접 이용 ===
//		book1.title = "봄봄";
//		System.out.println("======= 책 정보 ========");
//		System.out.println("제목 : " + book1.title);
//		
//		book1.publisher = "민음사";
//		System.out.println("출판사 : " + book1.publisher);
//		
//		book1.author = "김유정";
//		System.out.println("작가 : " + book1.author);
//		
//		book1.category = "소설";
//		System.out.println("장르 : " + book1.category);
//		
//		book1.price = 15000;
//		System.out.println("가격 : " + book1.price);
//		System.out.println("=====================");
		
		// === 메서드를 이용해 간접 접근 ===
		Book book1 = new Book();
		book1.setTitle("홍콩 3일 여행");
		System.out.println(book1.getTitle());
		
		book1.setPublisher("민음사");
		System.out.println(book1.getPublisher());
		
		book1.setCategory("여행");
		System.out.println(book1.getCategory());
		
		book1.setPrice(15000);
		System.out.println(book1.getPrice());
	}

}
