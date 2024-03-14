package Tregulov.stream;

import java.util.ArrayList;
import java.util.List;

public class minMaxLimitSkipMapToIntEx {
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

        Student min = students.stream().min((x,y) -> x.getAge() - y.getAge()).get();
        System.out.println(min);

        Student max = students.stream().max((x,y) -> x.getAge() - y.getAge()).get();
        System.out.println(max);

        students.stream().filter(e -> e.getAge() > 20).forEach(System.out::println);
        System.out.println("---------------------------------------");
        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);
        System.out.println("---------------------------------------");
        students.stream().filter(e -> e.getAge() > 20).skip(2).forEach(System.out::println);

        List<Integer> courses = students.stream().mapToInt(Student::getCourse).boxed().toList();

        int sum = students.stream().mapToInt(Student::getCourse).sum();
        System.out.println(sum);

        double average = students.stream().mapToInt(Student::getCourse).average().getAsDouble();
        System.out.println(average);

        int min2 = students.stream().mapToInt(Student::getCourse).min().getAsInt();
        System.out.println(min2);

        int max2 = students.stream().mapToInt(Student::getCourse).max().getAsInt();
        System.out.println(max2);
    }
}
