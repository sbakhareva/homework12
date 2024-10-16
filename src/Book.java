public class Book {
    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public static void main(String[] args) {
        Author author = new Author("m", "e");
        Book test = new Book("Test ", author, 2024);
        System.out.println(test.getTitle() + ", " + test.getYear() + ", " + test.getAuthor().getName() + test.getAuthor().getSurname());

    }


}
