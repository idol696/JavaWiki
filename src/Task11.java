import java.util.LinkedHashSet;
import java.util.Set;
//Задание 11: Удаление дубликатов и объединение строк
public class Task11 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana"};
        Set<String> uniqueWords = new LinkedHashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println(String.join(" ", uniqueWords));
    }
}
