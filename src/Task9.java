//Задание 9: Пример собственного исключения
public class Task9 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Моя ошибка");
        } catch (CustomException e) {
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }
}
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}