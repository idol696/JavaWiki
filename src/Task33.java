//Задание 33: Программа для удаления всех пробелов из строки с использованием replace()

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        scanner.close();

        // Удаление всех пробелов
        String noSpaces = input.replace(" ", "");

        System.out.println("Строка без пробелов: " + noSpaces);
    }
}
