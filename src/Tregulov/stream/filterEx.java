package Tregulov.stream;

import java.util.ArrayList;
import java.util.List;

public class filterEx {
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

//        students = students.Tregulov.stream().filter(element -> element.getAge() > 22 && element.getAvgGrade() < 7.2)
//                .collect(Collectors.toList());
//
//        System.out.println(students);
//
//        Stream<Student> myStream = Stream.of(s1, s2, s3 ,s4);

//        students = students.Tregulov.stream().sorted((x,y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        System.out.println(students);

        students.stream().map(el -> {
            el.setName(el.getName().toUpperCase());
            return el;
        })
                .filter(elem -> elem.getSex()=='f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .forEach(el -> System.out.println(el));
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
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
}