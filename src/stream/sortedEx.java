package stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sortedEx {
    public static void main(String[] args) {
        int[] array = {5, 7, 9 , 3, 1};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

//        students = students.stream().sorted((x,y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        System.out.println(students);
    }
}
