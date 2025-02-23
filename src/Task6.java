import java.util.Objects;

public class Task6 {
    //Задание 6: Реализовать equals и hashCode для класса Student
    static class Student {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Student)) return false;
            Student student = (Student) obj;
            return age == student.age && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Alice", 20);
        System.out.println(s1.equals(s2));
    }
}
