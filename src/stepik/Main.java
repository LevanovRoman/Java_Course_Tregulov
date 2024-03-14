package stepik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        String op;
        int result = 0;

        String[] inputValues = readInput();
        x = Integer.parseInt(inputValues[0]);
        op = inputValues[1];
        y = Integer.parseInt(inputValues[2]);

        result = switch (op) {
            case "-" -> x - y;
            case "+" -> x + y;
            default -> result;
        };

        System.out.println(result);
    }

    public static String[] readInput() {
        String[] inputValues = new String[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            inputValues = input.split(" ");
        }
        scanner.close();

        return inputValues;
    }
}
