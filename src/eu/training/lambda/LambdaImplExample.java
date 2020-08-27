package eu.training.lambda;

import java.util.function.Function;

public class LambdaImplExample {

    public static void main(String[] args) {

        ComparatorLambda<Person> cmpAge = (p1, p2)->p2.getAge() - p1.getAge();
        ComparatorLambda<Person> cmpFirstName = (p1, p2)->p2.getFirstName().compareTo(p1.getFirstName());

        Function<Person, Integer> fAge = p -> p.getAge();
        Function<Person, String> fFirstName = p -> p.getFirstName();

        ComparatorLambda<Person> cmpPersonAge = ComparatorLambda.comparing(p -> p.getAge());
        ComparatorLambda<Person> cmpPersonAge2 = ComparatorLambda.comparing(Person::getAge);
        ComparatorLambda<Person> cmpPersonFirstName = ComparatorLambda.comparing(Person::getFirstName);

        ComparatorLambda<Person> cmp = cmpPersonAge.thenComparing(cmpFirstName);


    }
}
