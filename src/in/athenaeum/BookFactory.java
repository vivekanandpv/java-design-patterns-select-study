package in.athenaeum;

public interface BookFactory {
    static Book getBook(BookType type) {
        switch (type) {
            case COMIC -> new ComicBook();
            case TECH -> new TechBook();
            case TEXT -> new TextBook();
            case NOVEL -> new Novel();
        }

        throw new RuntimeException();
    }
}
