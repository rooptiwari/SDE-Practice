package Software_Engineer.Java8Feature.FunctionalInterfaceConcept;

import java.util.function.Function;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        Function<String,Integer> func = x -> x.length();
//        int n = func.apply("My name is Roopam");
//        System.out.println(n);

        Function<Integer, Integer> func2= x -> x*2;

       int n =  func.andThen(func2).apply("My name is Roopam and I am a software Engineer");
        System.out.println(n);


    }
}
