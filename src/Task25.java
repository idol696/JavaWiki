public class Task25 {
    //Задание 25: Литералы int и byte
    public static void main(String[] args) {
        int intLiteral = 100;
        byte byteLiteral = 10;

        System.out.println("int: " + intLiteral);
        System.out.println("byte: " + byteLiteral);
    }
}
//int занимает 4 байта, byte — 1 байт.
//При присвоении byte b = 100; это возможно, так как 100 входит в диапазон -128 до 127.
//Если byte b = 130;, компилятор выдаст ошибку.