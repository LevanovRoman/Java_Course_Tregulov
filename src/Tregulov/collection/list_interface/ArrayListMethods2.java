package Tregulov.collection.list_interface;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student s3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student s4 = new Student("Petr", 'm', 35, 4, 7);
        Student s5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        System.out.println(studentList);

        Student s6 = new Student("Mariya", 'f', 23, 3, 9.1);
        studentList.remove(s6);
        System.out.println(studentList);
    }
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(avgGrade, student.avgGrade) == 0 && Objects.equals(name, student.name);
    }

}