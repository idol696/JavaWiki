public class Task22 {
    //Задание 22: Сравнение строк
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        System.out.println("s1 == s2 ? " + (s1 == s2)); // true
        System.out.println("s1 == s3 ? " + (s1 == s3)); // false
        System.out.println("s1 equals s3 ? " + s1.equals(s3)); // true
    }
}
