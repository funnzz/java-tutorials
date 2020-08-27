package eu.training.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceLearn {
// has only one abstract method.
// default methods doesn't count
// static methods doesn't count
// methods from Object class doesn't count
// it is optional to annotate with @FunctionalInterface

    public static void main(String[] args) {

//Consumer<T> interface
//has one abstract method
// public void accept(T t)
        Consumer<String> printer = s-> System.out.println(s);
        Consumer<String> printerMethReference = System.out::println;

//Supplier<T> Interface
//has one abstract method
// public T get()

        Supplier<Person> personSupplier = () -> new Person();
        Supplier<Person> suplierMethRef = Person::new;

//Function<T,R> Interface
//has one abstract method
// public R apply(T t)

        Function<Person, Integer> personAge = person -> person.getAge();
        Function<Person, Integer> personMethRef = Person::getAge;

//Predicate<T> Interface
//has one abstract method
// public boolean test(T t)

        Predicate<Person> ageGT20 = person -> person.getAge()>20;
    }
}
