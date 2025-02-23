public class Task12 {
    //Задание 12: Форматирование списка книг
    public static void main(String[] args) {
        String[][] books = {{"Война и мир", "Лев Толстой"}, {"1984", "Джордж Оруэлл"}};

        for (String[] book : books) {
            String[] author = book[1].split(" ");
            String formatted = String.format("\"%s\" %s. %s.", book[0], author[0].charAt(0), author[1]);
            System.out.println(formatted);
        }
    }
}
