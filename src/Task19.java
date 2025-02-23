import java.util.*;
//Задание 19: Найти книги определенного автора
public class Task19 {
    static class Book {
        String name;
        int authorId;

        public Book(String name, int authorId) {
            this.name = name;
            this.authorId = authorId;
        }
    }

    static class Author {
        int id;
        String name;

        public Author(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("1984", 1),
                new Book("Animal Farm", 1),
                new Book("The Hobbit", 2),
                new Book("LOTR", 2)
        );

        List<Author> authors = Arrays.asList(
                new Author(1, "George Orwell"),
                new Author(2, "J.R.R. Tolkien")
        );

        String targetAuthor = "George Orwell";
        int authorId = -1;
        for (Author a : authors) {
            if (a.name.equals(targetAuthor)) {
                authorId = a.id;
                break;
            }
        }

        for (Book b : books) {
            if (b.authorId == authorId) {
                System.out.println(b.name);
            }
        }
    }
}
