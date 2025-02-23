import java.util.*;
//Задание 14: Удалить дубли, отсортировать пользователей и вернуть самого старого
public class Task14 {
    static class User {
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", 30),
                new User("Bob", 25),
                new User("Alice", 30),
                new User("Charlie", 35),
                new User("Bob", 27)
        );

        Set<User> uniqueUsers = new TreeSet<>(Comparator.comparingInt((User u) -> u.age).thenComparing(u -> u.name));
        uniqueUsers.addAll(users);

        User oldest = Collections.max(uniqueUsers, Comparator.comparingInt(u -> u.age));
        System.out.println(oldest.name + ", " + oldest.age);
    }
}
