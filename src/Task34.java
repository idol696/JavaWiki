import java.util.Scanner;

public class Task34 {
    //Задача 34 - удаление всех пробелов из строки без использования replace().
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        scanner.close();

        // Удаление пробелов вручную
        String noSpaces = removeSpaces(input);

        System.out.println("Строка без пробелов: " + noSpaces);
    }

    public static String removeSpaces(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {  // Если символ не пробел, добавляем в результат
                result.append(ch);
            }
        }

        return result.toString();
    }
}
