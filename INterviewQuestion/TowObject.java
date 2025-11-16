package INterviewQuestion;

import java.util.Arrays;
import java.util.List;

public class TowObject {
    static class Employee{
        String name ;
        List<String> department;
        public Employee(String name, List<String> listDepartment){
            this.name = name;
            this.department = listDepartment;
        }

        public String getName(){
            return name;
        }

        public  List<String> getDepartment(){
            return department;
        }
    }

    static class Department{
        int department_id;
        List<Employee> employess;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Roopam", Arrays.asList("CEO", "UPSC")),
                new Employee("Sonali", Arrays.asList("UPSC","MPPSC")),
                new Employee("Pitaji", Arrays.asList("JUDGE", "UPSC"))
        );


    }
}
