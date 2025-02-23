    //Задание 31: Программа для поиска второго по величине числа в массиве
    //Мы реализуем простой алгоритм с одним проходом по массиву для нахождения второго максимального элемента.
    public class Task31 {
        public static void main(String[] args) {
            int[] numbers = {10, 5, 8, 20, 15, 20, 18};

            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int num : numbers) {
                if (num > firstMax) {
                    secondMax = firstMax;
                    firstMax = num;
                } else if (num > secondMax && num != firstMax) {
                    secondMax = num;
                }
            }

            if (secondMax == Integer.MIN_VALUE) {
                System.out.println("Второго по величине числа нет.");
            } else {
                System.out.println("Второе по величине число: " + secondMax);
            }
        }
    }


