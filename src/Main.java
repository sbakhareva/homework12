public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("John ", "R.R.Tolkien");
        Author author2 = new Author("Chris ", "Frith");

        Book lotr = new Book("The Lord of the Rings ", author1, 1954);
        System.out.println(lotr.getTitle() + ", " + lotr.getYear() + ", " + lotr.getAuthor().toString());
        lotr.setYear(1955);
        System.out.println(lotr.getTitle() + ", " + lotr.getYear() + ", " + lotr.getAuthor().toString());

        Book brain = new Book("Making up the mind ", author2, 2007);
        System.out.println(brain.getTitle() + ", " + brain.getYear() + ", " + brain.getAuthor().toString());

    }
}