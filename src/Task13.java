import java.util.*;
//Задание 13: Распределение книг по полкам
public class Task13 {
    public static void main(String[] args) {
        List<String> books = Arrays.asList("А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "К");
        Collections.sort(books);

        List<List<String>> shelves = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            shelves.add(new ArrayList<>());
        }

        for (int i = 0; i < books.size(); i++) {
            shelves.get(i % 5).add(books.get(i));
        }

        System.out.println(shelves);
    }
}
