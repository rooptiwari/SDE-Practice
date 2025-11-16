package String_Question;


import java.util.ArrayList;
import java.util.Arrays;




public class Office {

    static class Employee{
        int id;
        int age;
        String name;

        public  Employee(int id, int age, String name){
            this.id = id;
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "Employee{id=" + id + ", age=" + age + ", name='" + name + "'}";
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,26,"Sonali");

        System.out.println(emp1.name +" " +  emp1.age);

        ArrayList<Employee> employess = new ArrayList<>(Arrays.asList(
                new Employee(1,23,"Roopam"),
                new Employee(2,24,"Sonali")
        ));

        for (Employee emp : employess) {
            System.out.println(emp);
        }
    }
}
