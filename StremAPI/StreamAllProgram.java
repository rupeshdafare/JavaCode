package StremAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAllProgram {

    public static void main(String[] args) {

        // Convert a List<String> to uppercase using Streams.
        List<String> names = Arrays.asList("rupesh", "aditya", "sunit");
        // names.stream().map((i) -> i.toUpperCase()).forEach(System.out::println);
        names.stream().map((i) -> i.toUpperCase()).forEach(System.out::println);
        List<String> upperNames = names.stream()
                .map(i -> i.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperNames);

        System.out.println("===============================================================");

        // Given a List<Integer>, filter even numbers and collect them.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> data = numbers.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(data);

        System.out.println("===============================================================");

        // Count the number of strings in a list that start with a specific letter.
        List<String> strings = Arrays.asList("rupesh", "aditya", "sunit");
        long lonNumberg = strings.stream().filter((i) -> i.startsWith("a")).count();

        System.out.println(lonNumberg);

        System.out.println("===============================================================");

        // Find the maximum and minimum numbers in a list using Streams.

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = numbers1.stream().max(Integer::compare).get();
        int min = numbers1.stream().min(Integer::compare).get();
        System.out.println(max);
        System.out.println(min);
        System.out.println("===============================================================");

        // Sort a list of integers in descending order using Streams.
        List<Integer> decending = Arrays.asList(1, 3, 2, 9, 1, 8, 9, 10);
        decending.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("===============================================================");

        // Given a list of employees, group them by department using
        // Collectors.groupingBy().
        List<Employee> employees = Arrays.asList(new Employee("Rupesh", "IT"), new Employee("Aditya", "HR"),
                new Employee("Sunit", "IT"));
        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("===============================================================");

        // From the same list, find the highest-paid employee in each department.

        List<Employee1> high = Arrays.asList(new Employee1("Rupesh", "IT", 10000), new Employee1("Aditya", "HR", 20000),
                new Employee1("Sunit", "IT", 30000));
        high.stream().collect(Collectors.groupingBy(Employee1::getDepartment))
                .forEach((key, value) -> System.out
                        .println(key + " : " + value.stream().max(Comparator.comparing(Employee1::getSalary))));

    }
}

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Employee1 {
    private String name;
    private String department;
    private int salary;

    public Employee1(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name;
    }

}
