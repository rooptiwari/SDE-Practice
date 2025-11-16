package INterviewQuestion;

import java.time.chrono.MinguoChronology;
import java.util.*;

public class MaximumTop3Salary {

    static class Employee{
        int id;
        String name;
        String location;
        int salary;
        public  Employee(int id , String name , String location , int salary){
            this.id = id;
            this.name = name ;
            this.location = location;
            this.salary=salary;
        }
    }

    public static List<Employee> Top3HighPaying(List<Employee> employees){
        PriorityQueue<Employee> minHeap = new PriorityQueue<>(Comparator.comparingDouble(emp -> emp.salary));

        for(Employee emp : employees){
            minHeap.add(emp);
            if(minHeap.size() > 3){
                minHeap.poll();
            }
        }

        List<Employee> topEmplyee = new ArrayList<>(minHeap);
        topEmplyee.sort((a,b) -> Double.compare(b.salary,a.salary));
        return topEmplyee;
    }
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee(1,"Roopam","India",1000),
                new Employee(2,"Sonali","London",3000),
                new Employee(3,"Ram","London",400000),
                new Employee(3,"Kanhiya","London",500000)

        );

        List<Employee> TopEmp = Top3HighPaying(employee);

        for(Employee e : TopEmp){
            System.out.println(e.id +" "+e.name+" "+e.salary);
        }

    }
}
