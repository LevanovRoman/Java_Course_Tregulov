package lambda;


import java.util.ArrayList;

public class StudentInfoAlternative { //Класс, содержащий метод, который выполняет непосредственно саму фильтрацию поступающих объектов.
    // В перспективе этот класс может стать функциональным, то есть содержать полезные методы.
    // Но тогда для удобства методы должны иметь модификатор static, чтобы не создавать экземпляр класса.

    void testStudents(ArrayList<Student> al, StudentChecksAlt sc) { //Собственно, сам метод.
        // Поверхностно похож на методы printStudentsOverGrade, printStudentsUnderAge и printStudentsMixCondition.
        // Отличается наличием динамического параметра StudentChecks sc, через который мы передаём в метод условие фильтрации.

        for(Student s : al) {
            if(sc.check(s)) { //Здесь мы вызываем метод check() объекта,
                // который передали и который несёт конкретное условие фильтрации (в текущем примере - CheckOverGrade).
                System.out.println(s);
            }
        }
    }
}

interface StudentChecksAlt { //Интерфейс создан, чтобы объединить под одним типом все классы типа CheckOverGrade,
    // которые каждый по-своему реализуют метод check().
    // Иначе метод testStudents вместо динамического параметра будет содержать конкретный класс и таких методов нужно будет больше,
    // под каждый фильтр - оптимизации не будет, вернёмся к тому, с чего начинали.

    boolean check(Student s); //У всех фильтров, имплементирующих этот интерфейс,
    // будет идентичное название метода - не нужно будет регулярно править код в методе testStudents.
}

class CheckOverGradeAlt implements StudentChecksAlt { //Класс, реализующий конкретный фильтр.
    // Вот таких классов может быть много, каждый с индивидуальным условием фильтрации.

    @Override
    public boolean check(Student s) { //Реализация метода check().
        return s.avgGrade > 8;
    }
}

class TestAlt {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


        StudentInfoAlternative info = new StudentInfoAlternative(); //Будь метод testStudents() static,
        // не пришлось бы создавать экземпляр класса StudentInfoAlternative.

        info.testStudents(students, new CheckOverGradeAlt()); //Вызываем фильтрующий метод.
        // Передаем в него ArrayList и экземпляр объекта (имя фильтра),
        // в которм реализована нужная нам фильтрация. Метод принимает тип StudentChecks,
        // но, так как CheckOverGrade имплементирует StudentChecks, метод принимает и его.
    }
}