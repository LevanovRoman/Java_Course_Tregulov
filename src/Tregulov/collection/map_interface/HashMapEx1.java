package Tregulov.collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(3428, "Mariya Sidorova");
        map1.put(7968, "Nikolay Petrov");
        map1.put(1268, "Nikolay Petrov");
        map1.put(null, "Sergey Petrov");
        map1.put(34984, null);
        System.out.println(map1);

        map1.putIfAbsent(1000, "Oleg Ivanov");

        System.out.println(map1.get(1000));

        map1.remove(1268);

        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.containsKey(7968));

        System.out.println(map1.keySet());
        System.out.println(map1.values());




    }
}
