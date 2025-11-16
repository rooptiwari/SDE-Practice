//package INterviewQuestion;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class EmployeeDepartmentCount {
//
//    static class Employee {
//        private String name;
//        private List<String> departments;
//
//        public Employee(String name, List<String> departments) {
//            this.name = name;
//            this.departments = departments;
//        }
//
//        public List<String> getDepartments() {
//            return departments;
//        }
//    }
//
//
//    static class Department {
//
//        private String name;
//
//        public Department(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//    }
//    public static void main(String[] args) {
//        // Creating departments
//        Department dept1 = new Department("HR");
//        Department dept2 = new Department("IT");
//        Department dept3 = new Department("Finance");
//
//        // Creating employees
//        Employee emp1 = new Employee("Alice", Arrays.asList(dept1, dept2));
//        Employee emp2 = new Employee("Bob", Arrays.asList(dept1, dept3));
//        Employee emp3 = new Employee("Charlie", Arrays.asList(dept2));
//        Employee emp4 = new Employee("David", Arrays.asList(dept1, dept2, dept3));
//
//
//        // List of employees
//        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4);
//      //  List<Employee> employees = Arrays.asList(emp1, emp2, emp3);
//
//
//        // Counting employees in each department using streams
//        Map<String, Long> departmentEmployeeCount = employees.stream()
//                .flatMap(employee -> employee.getDepartments().stream())
//                .map(Department::getName)
//                .collect(Collectors.groupingBy(department -> department, Collectors.counting()));
////   ==================================================================================
//
//
//
//        Employee emp1 = new Employee("Alice", Arrays.asList("Hr","Teaching"));
//        Employee emp2 =  new Employee("Roop", Arrays.asList("Hr","HeadMaster"));
//        Employee emp3 = new Employee("Son", Arrays.asList("Hr","PT"));
//
//        List<Employee> employees = Arrays.asList(emp1, emp2, emp3);
//
//        Map<String, Long> departmentEmployeeCount = employees.stream()
//                .flatMap(employee -> employee.getDepartments().stream())
//             //   .map(Department::getName)
//                .collect(Collectors.groupingBy(department -> department, Collectors.counting()));
//
//
//        // Print the result
//        departmentEmployeeCount.forEach((department, count) -> System.out.println(department + ": " + count));
//    }
//}
