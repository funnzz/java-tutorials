package eu.training.lambda;

import java.util.function.BinaryOperator;

// In a method reference, you place the object (or class) that contains
// the method before the :: operator and the name of the method after it without arguments.
// A method reference can't be used for any method.
// They can only be used to replace a single-method lambda expression
public class MethodReferences {
    public static void main(String[] args) {

        BinaryOperator<Integer> sum = (i1,i2)-> i1+i2;
        BinaryOperator<Integer> sum2 = (i1,i2)-> Integer.sum(i1,i2);
        // method ref
        BinaryOperator<Integer> sum3 = Integer::sum;


    }
}
