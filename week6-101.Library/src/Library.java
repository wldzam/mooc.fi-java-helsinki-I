import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        books.add(newBook);
    }

    public void printBooks() {

        for (Book book : books) {
            System.out.println(book);
        }

    }

    public ArrayList<Book> searchByTitle(String title) {

        ArrayList<Book> found = new ArrayList<Book>();

        for (Book eachBook : books) {
            if (StringUtils.included(eachBook.title(), title)) {
                found.add(eachBook);
            }
        }

        return found;

    }

    public ArrayList<Book> searchByPublisher(String author) {

        ArrayList<Book> found = new ArrayList<Book>();

        for (Book eachBook:books) {
            if (StringUtils.included(eachBook.publisher(), author)) {
                found.add(eachBook);
            }
        }

        return found;

    }

    public ArrayList<Book> searchByYear(int year) {

        ArrayList<Book> found = new ArrayList<Book>();

        for (Book eachBook:books) {
            if (eachBook.year() == year) {
                found.add(eachBook);
            }
        }

        return found;

    }

}
