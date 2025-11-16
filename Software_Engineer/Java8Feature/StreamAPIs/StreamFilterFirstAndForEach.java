package Software_Engineer.Java8Feature.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterFirstAndForEach {
    public static void main(String[] args) {

        List<Customer> customerList = Arrays.asList(
                new Customer("Roopam", 27),
                new Customer("Sonal" , 27),
                new Customer("Papa", 54)
        );

        List<Customer> young = customerList.stream()
                                    .filter(e -> e.getAge() < 30)
                                    .collect(Collectors.toList());

        Customer name = customerList.stream()
                              .filter(e-> e.getName().equals("Roopam"))
                              .findAny()
                              .orElse(null);

        List<Customer> na = customerList.stream()
                .filter(e-> !e.getName().equals("Roopam"))
                        .toList();

        na.forEach(e ->
                System.out.println("Customer Age :" + e.getAge() + " ->  Customer Name :"+ e.getName()));

        String name1 = customerList.stream()
                          .filter(e -> ! e.getName().equals("Roopam"))// "Roopam".equals(e.getName())
                          .map(Customer::getName)
                          .findAny()
                          .orElse(null);
        System.out.println(name1);


        List<String> name2 = customerList.stream()
                                 .filter(e -> ! e.getName().equals("Roopam"))// "Roopam".equals(e.getName())
                                 .map(Customer::getName)
                                 .collect(Collectors.toList());

        name2.forEach(e -> System.out.print(e + " "));

        System.out.println(name1);

//        young.forEach(e ->
//                System.out.println("Customer Age :" + e.getAge() + " ->  Customer Name :"+ e.getName()));
    }
}
