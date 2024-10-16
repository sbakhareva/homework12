public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John", "R.R.Tolkien");
        Author author2 = new Author("Chris", "Frith");

        Book lotr = new Book("The Lord of the Rings ", author1, 1953);
        System.out.println(lotr.toString());
        lotr.setYear(1954);
        System.out.println(lotr.toString());

        Book brain = new Book("Making up the mind ", author2, 2007);
        System.out.println(brain.toString());

        Author authorTest1 = new Author("Suzanne", "Collins");
        Book bookTest1 = new Book("The Hunger Games", authorTest1, 2008);
        System.out.println(bookTest1.toString());
        Author authorTest2 = new Author("Suzanne", "Collins");
        Book bookTest2 = new Book("Gregor the Overlander", authorTest2, 2003);
        System.out.println(bookTest2.toString());
        System.out.println(authorTest1.equals(authorTest2));
        System.out.println(bookTest1.equals(bookTest2));
    }
}