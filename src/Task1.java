import java.util.*;

// Задание 1: Удалить первую букву из каждого имени и вернуть отсортированный список
public class Task1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> modifiedNames = new ArrayList<>();

        for (String name : names) {
            if (name.length() > 1) {
                modifiedNames.add(name.substring(1));
            }
        }

        Collections.sort(modifiedNames);
        System.out.println(modifiedNames);
    }
}
