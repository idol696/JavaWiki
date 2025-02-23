//Задание 32: Программа для проверки числа Армстронга на Java
//Число Армстронга (или число Нарцисса) — это число, сумма цифр которого, возведенных в степень,
// равную количеству цифр, равна самому числу. (153,9474)

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " - это число Армстронга.");
        } else {
            System.out.println(num + " - не является числом Армстронга.");
        }
    }

    public static boolean isArmstrong(int number) {
        int sum = 0, temp = number;
        int numDigits = String.valueOf(number).length(); // Определяем количество цифр

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return sum == number;
    }
}

