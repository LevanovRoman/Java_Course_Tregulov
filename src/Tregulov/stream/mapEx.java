package Tregulov.stream;

import java.util.*;
import java.util.stream.Collectors;

public class mapEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("ok");
        list.add("poka");

        List<Integer> list2 = list.stream().map(element -> element.length())
                .collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(list);

        int[] array = {5, 7, 9 , 3, 1};
        array = Arrays.stream(array).map(element
                -> {
            if (element % 3 == 0) {
                element = element / 3;
                }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(array));

        Set<String> set  = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("ok");
        set.add("poka");

        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);

    }
}
