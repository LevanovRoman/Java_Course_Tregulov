package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class collectEx {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student s3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student s4 = new Student("Petr", 'm', 35, 4, 7);
        Student s5 = new Student("Mariya", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

//        Map<Integer, List<Student>> map = students.stream().map(el ->{el.setName(el.getName().toUpperCase());
//                                     return el;})
//                         .collect(Collectors.groupingBy(Student::getCourse));
//
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()){
//            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
//        }

        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }


    }
}
