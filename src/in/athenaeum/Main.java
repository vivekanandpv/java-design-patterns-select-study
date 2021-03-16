package in.athenaeum;

public class Main {

    public static void main(String[] args) {
	    Book comicBook = BookFactory.getBook(BookType.COMIC);
		Book novel = BookFactory.getBook(BookType.NOVEL);
		Book techBook = BookFactory.getBook(BookType.TECH);
		Book textBook = BookFactory.getBook(BookType.TEXT);

	    // business logic
    }
}
