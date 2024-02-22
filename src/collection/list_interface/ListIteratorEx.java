package collection.list_interface;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for(char ch : s.toCharArray()){
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalendrom = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            if(iterator.next() != reverseIterator.previous()){
                isPalendrom = false;
                break;
            }
        }
        if (isPalendrom) System.out.println("Palindrom");
        else System.out.println("Not palindrom");

    }
}