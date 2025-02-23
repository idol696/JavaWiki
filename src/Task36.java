//Задание 36: Программа для вычисления суммы минимального и максимального значения в массиве
public class Task36 {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 1, 9, 4, 7};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int sum = min + max;
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Сумма минимального и максимального: " + sum);
    }
}

