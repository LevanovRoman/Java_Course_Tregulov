package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamEx {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(12.2);
        list.add(14.1);
        list.add(1.7);
        list.add(6.12);
        list.add(19.5);

        double result = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element).get();
        System.out.println(result);

        double result2 = list.parallelStream()
                .reduce((accumulator, element) -> accumulator / element).get();  //неправильный результат
        System.out.println(result2);
    }
}
