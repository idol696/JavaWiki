import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
//Задача 20: программа для обхода ArrayList с использованием обычного цикла for, цикла while и улучшенного цикла for:
public class Task29 {
    public static void main(String[] args) {
        // Создаем ArrayList и добавляем элементы
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // 1. Обход с помощью обычного цикла for
        System.out.println("Обход с помощью обычного for:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // 2. Обход с помощью улучшенного for-each
        System.out.println("\nОбход с помощью улучшенного for-each:");
        for (String name : names) {
            System.out.println(name);
        }

        // 3. Обход с помощью while и итератора
        System.out.println("\nОбход с помощью while и итератора:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. Обход с помощью обычного while
        System.out.println("\nОбход с помощью обычного while:");
        int index = 0;
        while (index < names.size()) {
            System.out.println(names.get(index));
            index++;
        }
    }
}
