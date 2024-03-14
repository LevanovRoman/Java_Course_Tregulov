package Tregulov.collection.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 3);
        Student s2 = new Student("Nikolay",  2);
        Student s3 = new Student("Elena",  1);
        Student s4 = new Student("Petr",  4);
        Student s5 = new Student("Mariya",   3);

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(s1);
        priorityQueue.add(s2);
        priorityQueue.add(s3);
        priorityQueue.add(s4);
        priorityQueue.add(s5);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public int compareTo(Student other){
        return this.course - other.course;
    }
}