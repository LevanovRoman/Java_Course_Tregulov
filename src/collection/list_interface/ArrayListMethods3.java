package collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1, "Misha");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Zaur12");
        arrayList2.add("Ivan");
        arrayList2.add("Mariya13");

        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);

        System.out.println(arrayList1.indexOf("Ivan"));
        System.out.println(arrayList1.lastIndexOf("Ivan"));
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("Ivan"));
//        for(String s : arrayList1) System.out.print(s+ " ");
//        System.out.println(arrayList1.get(2));
//
//        arrayList1.set(1, "Masha");
//        System.out.println(arrayList1);
//
//        arrayList1.remove(0);


    }
}
