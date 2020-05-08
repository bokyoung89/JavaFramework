package day0508.ex01.BookStore;

public class BookStore {
	
	private Book[] books;

	public BookStore(Book[] books) {
		this.books = books;
	}

	public Book[] getBookArray() {
		return books;
	}

	public void setBookArray(Book[] bookArray) {
		this.books = bookArray;
	}
	
	public void printBookStore() {
		for(int i=0; i<books.length; i++) {
			System.out.print((i+1)+"."+"\n");
			books[i].printInfo();
		}
	}
	
	public void printBooksByCategory(String searchWord) {
		int no = 0;
		for(int i=0; i<books.length; i++) {
			String category = books[i].getCategory();
			if(searchWord.equals(category)) {
				no = no + 1;
				System.out.print(no + "." + "\n");
				books[i].printInfo();
			}
		}
	}
	
	public void printBooksByMaxPrice(int setPrice) {
		int no = 0;
		for(int i=0; i<books.length; i++) {
			int maxPrice = books[i].getPrice();
			if(setPrice < maxPrice) {
				System.out.print(no + "." + "\n");
				books[i].printInfo();
			}
		}
		
	}
	
	public void printBooksByMinPrice() {
		
	}




}
