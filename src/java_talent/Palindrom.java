package java_talent;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        String original, reverse="";
        Scanner input = new Scanner(System.in);
        int length;
        System.out.println("Enter a number or string");
        original = input.nextLine();
        length = original.length();

        for(int i = length-1; i>=0; i--){
            reverse += original.charAt(i);
        }

        System.out.println("Reverse Value is: " + reverse);
        if (original.equals(reverse)) System.out.println("Palindrom");
        else System.out.println("Not");
    }
}
