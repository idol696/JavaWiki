import java.util.*;

public class Task17 {
    //Задание 17: Преобразовать массив User в Map<Phone, Name>
    static class User {
        String name;
        int age;
        String phone;

        public User(String name, int age, String phone) {
            this.name = name;
            this.age = age;
            this.phone = phone;
        }
    }

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", 30, "123-456"),
                new User("Bob", 25, "987-654"),
                new User("Charlie", 35, "555-789")
        );

        Map<String, String> phoneToName = new HashMap<>();
        for (User user : users) {
            phoneToName.put(user.phone, user.name);
        }

        System.out.println(phoneToName);
    }
}
