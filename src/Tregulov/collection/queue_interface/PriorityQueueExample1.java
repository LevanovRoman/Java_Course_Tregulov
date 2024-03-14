package Tregulov.collection.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(15);
        priorityQueue.add(8);
        priorityQueue.add(10);
        priorityQueue.add(103);
        // 1, 4, 8, 10, 15, 103
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
    }
}
