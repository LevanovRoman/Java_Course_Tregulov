package Tregulov.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int i = scanner.nextInt();
//        System.out.println("Введенное число: " + i);

//        System.out.println("Введите  2 числа");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Частное: " + x / y);

//        System.out.println("Введите пару слов");
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        System.out.println(s1 + s2);

        Scanner scanner = new Scanner("Privet moy drug\n Kak dela\n vse horosho");
//        String s = scanner.nextLine();
//        String s = scanner.next();
//        String s = scanner.nextLine();
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        ;


    }
}
