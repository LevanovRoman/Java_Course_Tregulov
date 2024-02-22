package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Mariya");
        queue.offer("Aleksandr"); //without exception
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll()); //without exception
        System.out.println(queue.element());
        System.out.println(queue.peek()); //without exception

        queue.remove("Aleksandr");
        System.out.println(queue);
    }
}
