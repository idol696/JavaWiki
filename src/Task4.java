public class Task4 {
    // Задание 4: Разделить строку на две части
    public static void main(String[] args) {
        String str = "HelloWorld";
        int mid = str.length() / 2;
        String part1 = str.substring(0, mid);
        String part2 = str.substring(mid);

        System.out.println(part1 + " | " + part2);
    }
}
