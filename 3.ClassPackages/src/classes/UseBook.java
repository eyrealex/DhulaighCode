package classes;

public class UseBook {

	public static void main(String[] args) {
		Book books[]=new Book[5];
		books[0]=new Book("Misery", "Stephen King", 1990);
		books[1]=new Book("Game of Thrones", "George R.R Martin", 2003);
		books[2]=new Book("Spiderman", "Marvel", 1997);
		books[3]=new Book("Captain America: Civil War", "Marvel", 2005);
		books[4]=new Book("IT", "Stephen King", 1991);
		
		for(int i =0;i<books.length; i++) {
			books[i].showMethod();
		}//end for
	}//end main

}//end class
