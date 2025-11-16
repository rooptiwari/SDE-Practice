package Software_Engineer.Java8Feature.StreamAPIs.SequentialStream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SeqStream {
    public static void main(String[] args) {
        Stream stream = Stream.of("Roopam","Sonali","Papa");

        // I have to comment thsi stream because It used once and close
        //stream.forEach(System.out::println);
          stream.findFirst().ifPresent(x-> System.out.println(x));


        Arrays.asList("a","b")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        IntStream.range(1,10).forEach(System.out::println);

        System.out.println("=======");
        Arrays.stream(new int [] {1,2,3,4})
                .map(n -> 2*n+1)
                .average()
                .ifPresent(x-> System.out.println(x));

        System.out.println("=======");

        Stream.of("a1","a11","a111")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);
    }

}
