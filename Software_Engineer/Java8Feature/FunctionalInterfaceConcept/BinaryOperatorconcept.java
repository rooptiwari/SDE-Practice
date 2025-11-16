package Software_Engineer.Java8Feature.FunctionalInterfaceConcept;

import java.util.function.BinaryOperator;

public class BinaryOperatorconcept {
    public static void main(String[] args) {
        BinaryOperator<Integer> fun = (x1,x2) -> x1+x2;
        int n = fun.apply(20,30);
        System.out.println(n);
    }
}
