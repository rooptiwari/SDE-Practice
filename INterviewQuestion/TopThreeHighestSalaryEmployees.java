package INterviewQuestion;
import java.util.*;

public class TopThreeHighestSalaryEmployees {

    static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }
    public static List<Employee> getTopThreeEmployees(List<Employee> employees) {
        // TreeMap to store salaries in descending order (salary -> list of employees)
        TreeMap<Double, List<Employee>> salaryMap = new TreeMap<>(Collections.reverseOrder());

        // Store employees grouped by salary
        for (Employee emp : employees) {
            salaryMap.putIfAbsent(emp.salary, new ArrayList<>());
            salaryMap.get(emp.salary).add(emp);
        }

        // Collect exactly 3 employees
        List<Employee> topEmployees = new ArrayList<>();
        int count = 0;

        for (Map.Entry<Double, List<Employee>> entry : salaryMap.entrySet()) {
            for (Employee emp : entry.getValue()) {
                topEmployees.add(emp);
                count++;
                if (count == 3) break; // Stop once we collect 3 employees
            }
            if (count == 3) break; // Ensure we only take top 3, even with duplicates
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

        System.out.println("Top 3 Highest Paid Employees (Exactly 3):");
        for (Employee emp : top3) {
            System.out.println(emp.name + " - $" + emp.salary);
        }
    }
}
