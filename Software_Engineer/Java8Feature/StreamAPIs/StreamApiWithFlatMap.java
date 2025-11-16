package Software_Engineer.Java8Feature.StreamAPIs;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApiWithFlatMap {
    public static void main(String[] args) {
        String [][] data = new String[][]{
                {"a","b"},
                {"c","d"},
                {"e","f"}
        };

        Stream<String[]> dataStream = Arrays.stream(data);
        Stream<String[]> dataStreamFilter = dataStream.filter(x -> "a".equals(x.toString()));
        dataStreamFilter.forEach(System.out :: println);

     Stream<String> ans =    Arrays.stream(data)
                .flatMap(x-> Arrays.stream(x))
                .filter(x->!"a".equals(x.toString()));

     ans.forEach(e -> System.out.print(e + ", "));
     System.out.println();
     Stream<String> ans2 = Arrays.stream(new String[][]{{"Roopam","Sonali"},{"Ashok","Susheela"}})
             .flatMap(x->Arrays.stream(x))
             .filter(x -> ! "Roopam".equals(x.toString()));

     ans2.forEach(x -> System.out.println(x+ ", "));

    }
}
