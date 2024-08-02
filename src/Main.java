import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Денис", "Фонвизин");
        Book book1 = new Book(author1, " Недоросль", 1752);
       book1.setPublicationYear(1988);
       Author author2 = new Author(" Лев", " Толстой");
        Book book2 = new Book(author2, " Булька", 1760);
        System.out.println();
        System.out.println( "Книга "+ book1.getTitleName() + ", автор "+ book1.getAuthor().getFirstName() + " " +  book1.getAuthor().getLastName()+" , год издания : " + book1.getPublicationYear());
        System.out.println( book2.equals(book1));
        System.out.println( author2.equals(author1));

    }
}
