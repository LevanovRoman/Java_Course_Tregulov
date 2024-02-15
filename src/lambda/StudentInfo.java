package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> a1, Predicate<Student> pr){
        for(Student s : a1){
            if (pr.test(s)) System.out.println(s);
        }
    }

//    void printStudentsOverGrade(ArrayList<Student> a1, double grade){
//        for(Student s : a1){
//            if (s.avgGrade > grade) System.out.println(s);
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> a1, int age){
//        for(Student s : a1){
//            if (s.age < age) System.out.println(s);
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> a1, int age, double grade, char sex){
//        for(Student s : a1){
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) System.out.println(s);
//        }
//    }
}

class Test{
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student s2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student s3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student s4 = new Student("Petr", 'm', 35, 4, 7);
        Student s5 = new Student("Mariya", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        StudentInfo info = new StudentInfo();



        System.out.println("-----------------------------");
//        info.testStudents(students, (Student s) -> {return s.avgGrade>8;});
//        //analog
//        info.testStudents(students, p -> p.avgGrade>8);
//        //analog
//        StudentChecks sc = (Student s) -> {return s.avgGrade>8;};
//        info.testStudents(students, sc);
        //analog
//        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//
//        info.testStudents(students, p1.and(p2)); //объединение условий p1.and(p2).and(p3).and(p4)...and(pN)
//        System.out.println("-----------------------------");
//        info.testStudents(students, p1.or(p2));
//        System.out.println("-----------------------------");
//        info.testStudents(students, p1.negate());



//        System.out.println("-----------------------------");
//        info.testStudents(students, (Student s) -> {return s.age<30;});
//        System.out.println("-----------------------------");
//        info.testStudents(students, (Student s) -> {return s.age>20 && s.avgGrade<9.3 && s.sex=='f';});

//        info.printStudentsOverGrade(students, 8);
//        System.out.println("-----------------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("-----------------------------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');

        Function<Student, Double> f = student -> student.avgGrade;//just example

        double res = avgOfSomething(students, student -> student.avgGrade);
        System.out.println(res);

        double res2 = avgOfSomething(students, student -> (double) student.course);
        System.out.println(res2);

        double res3 = avgOfSomething(students, student -> (double) student.age);
        System.out.println(res3);
    }

    private static double avgOfSomething(List<Student> list, Function<Student, Double> f){
        double result = 0;
        for(Student st : list){
            result += f.apply(st);
        }
        result = result / list.size();
        return result;
    }
}

//interface StudentChecks{
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks{
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}