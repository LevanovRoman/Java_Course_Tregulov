package Tregulov.collection.list_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Elena");
        arrayList1.add("Misha");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            iterator.next();
            iterator.remove();
        }

        System.out.println("arrayList= " + arrayList1);


    }
}
