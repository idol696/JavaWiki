import java.util.Arrays;

public class Task10 {
    //Задание 10: Обработка нескольких исключений в одном catch
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        try {
            for (int i = 0; i < arr.length+1; i++) {
                arr[i] = 2;
            }
            arr[2] = null;
            arr[3] += arr[2]; // Ошибка выхода за границы массива
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
