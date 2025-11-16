package INterviewQuestion;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateEmployee {
    static class Employee{
        int id;
        String name;
        double salary;
                public Employee(int id, String name , double salary){
                    this.id = id;
                    this.name = name;
                    this.salary = salary;
                }
    }
    public static void main(String[] args) {
       List<Employee> employee = Arrays.asList(
               new Employee(101,"roop", 1000),
               new Employee(102,"roop", 1000),
               new Employee(102,"roop", 1000),
               new Employee(101,"roop", 1000)

       );

       Map<Integer, Long> duplicateIdCount = employee.
               stream().
               collect(Collectors.groupingBy(emp -> emp.id, Collectors.counting()));
       duplicateIdCount.
               entrySet().
               stream().
               filter(entry -> entry.getValue() > 1).
               forEach(entry -> System.out.println("Employe ID:  [" + entry.getKey() + "] : Employr ID count = " + entry.getValue()));
    }
}
