package eu.training.lambda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Practice {

    public static void main(String[] args) {

        String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};

        Comparator<String> compLength = (String s1, String s2)-> s2.length() - s1.length();
        Stream.of(toppings).sorted(compLength).forEach(System.out::println);

        List<Integer> myList = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            myList.add(i);
        }

        List filterList = myList.stream()
                .filter(p->p>3)
                .collect(Collectors.toList());
        System.out.println(filterList);

        Stream<Integer> intList = Stream.generate(() ->(new Random()).nextInt(100));
        //intList.limit(20).forEach(System.out::println);

        List evenNb = myList.stream()
                .filter(x->x%2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNb);

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        List<String>upperCaseNames = memberNames.stream()
                .filter(p->p.startsWith("A"))
                .map(p->p.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);

         memberNames.stream()
                .sorted(compLength)
                .forEach(System.out::println);

        long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();
        System.out.println(totalMatched);

        String str = memberNames.stream()
                .filter(s -> s.length()>4)
                .findFirst()
                .get();
        System.out.println(str);
    }
}
