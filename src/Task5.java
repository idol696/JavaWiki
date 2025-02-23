public class Task5 {
    // Задание 5: Пример Enum
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
