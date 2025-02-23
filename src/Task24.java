import java.io.*;

//Задание 24: Ошибка в коде с catch
public class Task24 {
    public static void foo() throws IOException, FileNotFoundException {
        // Заглушка метода
    }

    public static void main(String[] args) {
        try {
            foo();
        } catch (FileNotFoundException e) { // Ошибка: уже обработан IOException
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* Решение - изменить порядок catch
        try {
        foo();
          } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
    }
}
