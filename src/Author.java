public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public static void main(String[] args) {
        Author author = new Author("Chris ", "Frith");
        System.out.println(author.getName() + author.getSurname());
    }
}
