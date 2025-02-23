import java.util.Arrays;
//Задание 15: Изменить четные числа и вернуть срез массива
public class Task15 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 9, 4, 7, 6, 1, 10};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
        }

        int[] result = Arrays.copyOfRange(arr, 2, 7);
        System.out.println(Arrays.toString(result));
    }
}
