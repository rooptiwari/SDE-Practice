package Software_Engineer.Java8Feature.FunctionalInterfaceConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperators {
    public static void main(String[] args) {
        UnaryOperator<Integer> fun = x-> x*8;
        int n = fun.apply(3);
        System.out.println(n);

        List<String> language = new ArrayList<String>();
        language.add("Java");
        language.add("C#");

        System.out.println(language);

        language.replaceAll(x->x+" Roopam");
        System.out.println(language);

    }
}
