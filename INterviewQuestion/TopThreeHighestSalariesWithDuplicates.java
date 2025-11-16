package INterviewQuestion;
import java.util.*;
public class TopThreeHighestSalariesWithDuplicates {

    static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }
    public static List<Employee> getTopThreeEmployees(List<Employee> employees) {
        // TreeMap to store salaries and corresponding employees
        TreeMap<Double, List<Employee>> salaryMap = new TreeMap<>(Collections.reverseOrder());

        // Store employees in the map by salary
        for (Employee emp : employees) {
            salaryMap.putIfAbsent(emp.salary, new ArrayList<>());
            salaryMap.get(emp.salary).add(emp);
        }

        // Collect top 3 highest salaries
        List<Employee> topEmployees = new ArrayList<>();
        int count = 0;

        for (Map.Entry<Double, List<Employee>> entry : salaryMap.entrySet()) {
            topEmployees.addAll(entry.getValue()); // Add all employees with this salary
            count++;
            if (count == 3) break; // Stop after collecting 3 highest salary groups
        }

        return topEmployees;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 75000),
                new Employee("Bob", 90000),
                new Employee("Charlie", 120000),
                new Employee("David", 85000),
                new Employee("Eve", 90000),  // Duplicate salary with Bob
                new Employee("Frank", 110000),
                new Employee("Grace", 120000), // Duplicate salary with Charlie
                new Employee("Hank", 85000)   // Duplicate salary with David
        );

        List<Employee> top3 = getTopThreeEmployees(employees);

        System.out.println("Top 3 Highest Paid Employees (Including Duplicates):");
        for (Employee emp : top3) {
            System.out.println(emp.name + " - $" + emp.salary);
        }
    }
}