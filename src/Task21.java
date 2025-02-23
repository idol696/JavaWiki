public class Task21 {
    //Задание 21: Анализ кода метода foo()
    public static void foo() {
        String m = "Hello";
        System.out.print(m);
        bar(m);
        System.out.print(m);
    }

    public static void bar(String m) {
        m += " World!";
    }

    public static void main(String[] args) {
        foo(); // Выведет "HelloHello"
    }
}
