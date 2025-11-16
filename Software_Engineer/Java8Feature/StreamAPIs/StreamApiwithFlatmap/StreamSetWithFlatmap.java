package Software_Engineer.Java8Feature.StreamAPIs.StreamApiwithFlatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSetWithFlatmap {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Roopam");
        emp1.addDeviceName("Iphone");
        emp1.addDeviceName("Mac");
        emp1.addDeviceName("IPad");
        emp1.addDeviceName("AppleWatch");

        Employee emp2 = new Employee();
        emp2.setName("Sonali");
        emp2.addDeviceName("Iphone");
        emp2.addDeviceName("Samsung");
        emp2.addDeviceName("Watch");
        emp2.addDeviceName("Macbookpro");


        List<Employee> empList = Arrays.asList(emp1,emp2);

        List<String> uniqeDevices = empList.stream()
                .map(x -> x.getDevides())
                .flatMap(x -> x.stream())
                .distinct()
                .collect(Collectors.toList());

        uniqeDevices.forEach(x -> System.out.println(x+ ", "));




    }
}
