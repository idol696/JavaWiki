public class Task28 {
    //Задание 28: Числа Фибоначчи
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
