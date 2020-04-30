package day0422.example3;

public class Book {
	// === 메소드를 이용해 간접 접근 ===
	String title;//제목
	public void setTitle(String newTitle) {	//setter
		title = newTitle;
	}
	public String getTitle() {	//getter
		return title;
	}
	String publisher;//출판사
	public void setPublisher(String newPublisher) {
		publisher = newPublisher;
	}
	public String getPublisher() {	
		return publisher;
	}
	String author;//작가
	public void setAuthor(String newAuthor) {
		publisher = newAuthor;
	}
	public String getAuthor() {	
		return author;
	}
	String category;//장르
	public void setCategory(String newCategory) {
		category = newCategory;
	}
	public String getCategory() {	
		return category;
	}
	int price;//가격
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	public int getPrice() {	
		return price;
	}


}
