public class Task8 {
    // Задание 8: Пример throws
    public static void riskyMethod() throws Exception {
        throw new Exception("Произошла ошибка");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }
}
