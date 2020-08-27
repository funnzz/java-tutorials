package eu.training.collections;

//LinkedList is a linear data structure.
// However LinkedList elements are not stored in contiguous locations like arrays, they are linked with each other using pointers.
// Each element of the LinkedList has the reference(address/pointer) to the next element of the LinkedList.
// Each element in the LinkedList is called the Node.
// Each Node of the LinkedList contains two items:
// 1) Content of the element
// 2) Pointer/Address/Reference to the Next Node in the LinkedList.
// Maintain the elements insertion order

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class BasicLinkedList {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();

        list.add("Steve");
        list.add("Star");
        list.add("Stve");
        list.add("Carl");
        list.add("Raj");

        //Adding an element to the first position
        list.addFirst("Negan");

        //Adding an element to the last position
        list.addLast("Rick");

        //Adding an element to the 3rd position
        list.add(2, "Glenn");

        list.stream().forEach(p->System.out.println("name: "+p));
        ArrayList<String> strList = list.stream()
                .filter(p->p.startsWith("S"))
                .collect(Collectors.toCollection(ArrayList::new));
        strList.forEach(System.out::println);

    }
}
