package 김재열실기평가;

public class Book {

	String bookCode;
	String bookTitle;
	String author;

	public Book(String bookCode, String bookTitle, String author) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
	}

	public Book() {
		
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", author=" + author + "]";
	}

}
