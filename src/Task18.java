import java.util.*;
//Задание 18: Найти максимальную и среднюю зарплату в каждом отделе
public class Task18 {
    static class Employee {
        String name, department;
        int salary;

        public Employee(String name, String department, int salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 5000),
                new Employee("Bob", "IT", 7000),
                new Employee("Charlie", "HR", 4000),
                new Employee("Dave", "HR", 4500),
                new Employee("Eve", "IT", 6000)
        );

        Map<String, List<Integer>> salaries = new HashMap<>();

        for (Employee e : employees) {
            salaries.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e.salary);
        }

        for (Map.Entry<String, List<Integer>> entry : salaries.entrySet()) {
            List<Integer> sal = entry.getValue();
            if (sal.size() > 1) {
                int max = Collections.max(sal);
                double avg = sal.stream().mapToInt(i -> i).average().orElse(0);
                System.out.println(entry.getKey() + " -> Max: " + max + ", Avg: " + avg);
            }
        }
    }
}
