public abstract class Task23 {
    //Задание 23: Вывести результат выполнения кода с абстрактным классом
    public Task23() {
        System.out.println("This is abstract class constructor");
    }
}

class OurDemoClass extends Task23 {
    public OurDemoClass() {
        System.out.println("This is demo class constructor");
    }

    public static void main(String[] args) {
        OurDemoClass ourDemoClass = new OurDemoClass();
    }
}
