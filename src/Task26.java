import java.util.HashMap;
import java.util.Map;
//Задание 26: Подсчет слов в строке с HashMap
public class Task26 {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana apple";
        String[] words = text.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);
    }
}
