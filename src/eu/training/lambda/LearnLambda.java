package eu.training.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LearnLambda {

    public static void main(String[] args) {

// example basic comparator.
// Comparator interface has one method -> compare()

        // instance of anonymous class
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        Comparator<String> lambdaComparator =
                (String o1, String o2)-> Integer.compare(o1.length(), o2.length());

        List ls = Arrays.asList("Something","else", "nothing","nn");
        ls.sort(comparator);
        System.out.println(ls);
        ls.stream().sorted(lambdaComparator).forEach(System.out::println);
    }
}
