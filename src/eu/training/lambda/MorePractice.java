package eu.training.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MorePractice {

    public static void main(String[] args) {

        List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));

        list.add(new Hosting(1, "linode.com", 100000));
        list.add(new Hosting(1, "ode.com", 10));

        Map<Integer, String> myMap = list.stream()
                .filter(h->h.getWebsites()<100001)
                .collect(Collectors.toMap(Hosting::getId,Hosting::getName,
                        (oldVal,newVal)->newVal));
        System.out.println(myMap);

        List<String> strLs = myMap.values()
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(strLs);


    }
}
