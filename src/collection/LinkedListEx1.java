package collection;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student3 s1 = new Student3("Ivan",  3);
        Student3 s2 = new Student3("Nikolay", 2);
        Student3 s3 = new Student3("Elena", 1);
        Student3 s4 = new Student3("Petr", 4);
        Student3 s5 = new Student3("Mariya", 3);

        LinkedList<Student3> student3LinkedList = new LinkedList<>();
        student3LinkedList.add(s1);
        student3LinkedList.add(s2);
        student3LinkedList.add(s3);
        student3LinkedList.add(s4);
        student3LinkedList.add(s5);

        System.out.println("LinkedList= " + student3LinkedList);
        System.out.println(student3LinkedList.get(2));

        Student3 s6 = new Student3("Zaur", 3);
        Student3 s7 = new Student3("Igor", 4);
        student3LinkedList.add(s6);
        System.out.println("LinkedList= " + student3LinkedList);
        student3LinkedList.add(1, s7);
        System.out.println("LinkedList= " + student3LinkedList);
        student3LinkedList.remove(3);
        System.out.println("LinkedList= " + student3LinkedList);
    }
}

class Student3 {
    String name;
    int course;

    public Student3(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}