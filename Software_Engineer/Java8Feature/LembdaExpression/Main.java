package Software_Engineer.Java8Feature.LembdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Ram","Shyam","ganpati");

        name.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string);
            }
        });

        name.forEach(emp -> System.out.println(emp));

        name.forEach(System.out :: println);
    }
}
