package Tregulov.collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Ivan", "Tregulov", 22);
        Student st2 = new Student("Nikolay", "Sidorov", 28);
        Student st3 = new Student("Elena", "Ivanova", 19);
        Student st4 = new Student("Elena", "Ivanova", 19);
        Student st5 = new Student("Igor", "Petrov", 4);
        Student st6 = new Student("Igor", "Petrov", 4);
        treeMap.put(5.8, st1);
        treeMap.put(8.2, st2);
        treeMap.put(7.5, st3);
        treeMap.put(4.9, st4);
        treeMap.put(9.1, st5);
        treeMap.put(3.2, st6);
        System.out.println(treeMap);

        System.out.println(treeMap.descendingMap());

        System.out.println(treeMap.tailMap(7.3));
        System.out.println(treeMap.headMap(7.3));

        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
    }

}
