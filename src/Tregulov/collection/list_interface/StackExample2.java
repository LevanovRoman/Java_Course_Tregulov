package Tregulov.collection.list_interface;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Zaur");
        stack.add("Ivan");
        stack.add("Mariya");
        stack.add("Elena");
        System.out.println(stack);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }

        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
