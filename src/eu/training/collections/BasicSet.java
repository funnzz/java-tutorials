package eu.training.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//represents a collection of objects where each object in the Java Set is unique.
// In other words, the same object cannot occur more than once in a Java Set.
// If the Set is not typed, using Java Generics, then you can even mix objects of different types (classes) in the same Set
public class BasicSet {

    public static void main(String[] args) {

        Set setA = new HashSet();
        Set setB = new LinkedHashSet();
        Set setC = new TreeSet();

        System.out.println("HashSet sorted, not ordered: ");
        setA.add("B");
        setA.add("A");
        setA.add("D");
        setA.add("E");
        setA.add("C");
        setA.add("F");
        System.out.println(setA);

        System.out.println("LinkedHashSet not sorted, ordered: ");
        setB.add("B");
        setB.add("A");
        setB.add("D");
        setB.add("E");
        setB.add("C");
        setB.add("F");
        System.out.println(setB);

//TreeSet does not allow to insert Heterogeneous objects.
//It will throw a classCastException at Runtime if we try to add heterogeneous objects
        System.out.println("TreeSet sorted, not ordered: ");
        setC.add("B");
        setC.add("A");
        setC.add("D");
        setC.add("E");
        setC.add("C");
        setC.add("F");
        System.out.println(setC);

    }
}
