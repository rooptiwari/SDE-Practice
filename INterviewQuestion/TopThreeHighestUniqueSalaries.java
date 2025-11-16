package INterviewQuestion;

import java.util.*;

public class TopThreeHighestUniqueSalaries {

   static class Employee {
        String name;
        double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }
    public static List<Employee> getTopThreeEmployees(List<Employee> employees) {
        // TreeSet to store unique salaries (sorted in descending order)
        TreeSet<Double> salarySet = new TreeSet<>(Collections.reverseOrder());

        // Store unique salaries
        for (Employee emp : employees) {
            salarySet.add(emp.salary);
        }

        // Extract top 3 highest unique salaries
        List<Double> topSalaries = new ArrayList<>();
        Iterator<Double> it = salarySet.iterator();
        while (it.hasNext() && topSalaries.size() < 3) {
            topSalaries.add(it.next());
        }

        // Use LinkedHashSet to prevent duplicate employees in final output
        Set<Employee> topEmployees = new LinkedHashSet<>();

        // Find unique employees matching top 3 salaries
        for (Double salary : topSalaries) {
            for (Employee emp : employees) {
                if (emp.salary == salary) {
                    topEmployees.add(emp);
                    break; // Stop after finding one unique employee per salary
                }
            }
        }

        return new ArrayList<>(topEmployees);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 75000),
                new Employee("Bob", 90000),
                new Employee("Charlie", 120000),
                new Employee("David", 85000),
                new Employee("Eve", 90000),  // Duplicate salary (should be ignored)
                new Employee("Frank", 110000),
                new Employee("Grace", 120000), // Duplicate salary (should be ignored)
                new Employee("Hank", 85000)   // Duplicate salary (should be ignored)
        );

        List<Employee> top3 = getTopThreeEmployees(employees);

        System.out.println("Top 3 Highest Paid Employees (Unique Salaries Only):");
        for (Employee emp : top3) {
            System.out.println(emp.name + " - $" + emp.salary);
        }
    }
}
