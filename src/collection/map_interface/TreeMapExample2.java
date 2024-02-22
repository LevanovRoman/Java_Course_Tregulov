package collection.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        //  Student  должен быть Comparable
        TreeMap<Student, Double> treeMap = new TreeMap<>();

        // или использовать Comparator:
        TreeMap<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });

        Student st1 = new Student("Ivan", "Tregulov", 22);
        Student st2 = new Student("Nikolay", "Sidorov", 28);
        Student st3 = new Student("Elena", "Ivanova", 19);
        Student st4 = new Student("Elena", "Ivanova", 19);
        Student st5 = new Student("Igor", "Petrov", 4);
        Student st6 = new Student("Igor", "Petrov", 4);

        treeMap.put(st1, 5.8);
        treeMap.put(st2, 8.2);
        treeMap.put(st3, 7.5);
        treeMap.put(st4, 4.9);
        treeMap.put(st5, 9.1);
        treeMap.put(st6, 3.2);
        System.out.println(treeMap);
    }
}
