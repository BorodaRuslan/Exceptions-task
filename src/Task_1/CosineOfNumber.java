package Task_1;

import java.util.Scanner;

public class CosineOfNumber {
    public static Scanner scanner = new Scanner(System.in);
    public void сosineOfNumber() {
        System.out.println("Please enter a number");
        String next = scanner.next();
        try {
            int numFormat = Integer.parseInt(next);
            System.out.println("Cosine " + numFormat + " = " + Math.cos(numFormat));
        } catch (NumberFormatException e) {
            System.out.println("Number format error" + e.getMessage());
        }
    }
}
