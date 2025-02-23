public class Task3 {
    // Задание 3: Проверить, является ли строка палиндромом
    public static void main(String[] args) {
        String str = "radar";
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Палиндром" : "Не палиндром");
    }
}
