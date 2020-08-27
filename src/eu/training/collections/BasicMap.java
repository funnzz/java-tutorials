package eu.training.collections;

// A HashMap cannot contain duplicate keys.
// Java HashMap allows null values and the null key.
// HashMap is an unordered collection.
// It does not guarantee any specific order of the elements.

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicMap {
    public static void main(String[] args) {


        Map<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);
        numberMapping.put("One", 9);

        System.out.println(numberMapping);
        System.out.println(numberMapping.containsValue(6));
        System.out.println(numberMapping.containsKey("Two"));

        //Set<Map.Entry<String, Integer>> entry = numberMapping.entrySet();
        List ls = numberMapping.entrySet()
                .stream().
                filter(entry ->entry.getKey().contains("Two"))
                .collect(Collectors.toList());

        System.out.println(ls);

        numberMapping.entrySet()
                .forEach(entry-> {System.out.println(entry.getValue());});
    }
}