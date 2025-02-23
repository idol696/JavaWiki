import java.util.HashMap;
import java.util.Map;
//Задание 27: Итерация по HashMap
public class Task27 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Итерация с while
        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Улучшенный for-each
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
