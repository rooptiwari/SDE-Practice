package Software_Engineer.Java8Feature.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFirstCollect {
    public static void main(String[] args) {
        List<String> productlist = Arrays.asList("MY", "Name", "Is","Roopam");
        System.out.println(productlist);
        productlist.forEach(pro -> System.out.print(pro+ " "));
        System.out.println();
        List<String> newList = productlist
                .stream()
                .filter(e -> ! e.equals("Roopam"))
                .collect(Collectors.toList());

        newList.forEach(e -> System.out.print(e+" "));
        System.out.println();
      //  newList.forEach(System.out :: println);
    }
}
