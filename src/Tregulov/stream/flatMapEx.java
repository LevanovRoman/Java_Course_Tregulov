package Tregulov.stream;

import java.util.ArrayList;
import java.util.List;

public class flatMapEx {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student s3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student s4 = new Student("Petr", 'm', 35, 4, 7);
        Student s5 = new Student("Mariya", 'f', 23, 3, 9.1);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Maths");
        f1.addStudentToFaculty(s1);
        f1.addStudentToFaculty(s2);
        f1.addStudentToFaculty(s3);
        f2.addStudentToFaculty(s4);
        f2.addStudentToFaculty(s5);


        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOfFaculty().stream())
                .forEach(e-> System.out.println(e.getName()));

    }
}

class Faculty{
    String name;
    List<Student> studentsOfFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOfFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOfFaculty() {
        return studentsOfFaculty;
    }

    public void addStudentToFaculty(Student st){
        studentsOfFaculty.add(st);
    }
}
