public class Book {

    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public int year() {
        return year;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(title).append(", ").append(publisher).append(", ").append(year);
        return str.toString();
    }
}
