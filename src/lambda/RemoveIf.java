package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("hello");
        a1.add("buy");
        a1.add("ok");
        a1.add("Uchim Java");
        a1.add("a imenno lambda");

//        a1.removeIf(element -> element.length()<5);
// analog
        Predicate<String> p = element -> element.length()<5;
        a1.removeIf(p);
        System.out.println(a1);
    }
}
