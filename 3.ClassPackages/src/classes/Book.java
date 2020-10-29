package classes;

public class Book {
	String bookTitle;
	String bookAuthor;
	int bookPubDate;
	
	public Book(String bookTitle, String bookAuthor, int bookPubDate) {
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.bookPubDate=bookPubDate;
	}// constructor


	//****get and set methods****
	public String getBookTitle() {
		return bookTitle;
	}//end getBookTitle

	public String getBookAuthor() {
		return bookAuthor;
	}//end getBookAuthor

	public int getBookPubDate() {
		return bookPubDate;
	}//end getBookPubDate

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}//end setBookTitle

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}//end setBookAuthor

	public void setBookPubDate(int bookPubDate) {
		this.bookPubDate = bookPubDate;
	}//end setBookPubDate
	
	public void showMethod() {
		System.out.println("Book Title: " + getBookTitle());
		System.out.println("Book Author: " + getBookAuthor());
		System.out.print("Book Publication Date: " + getBookPubDate());
	}//end displayMethod

}//end class
