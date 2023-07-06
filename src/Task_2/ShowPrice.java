package Task_2;

import java.util.Scanner;

public class ShowPrice {
    public static Scanner scanner = new Scanner(System.in);
    public void showPrice(int[] price) {
        System.out.println("To view the price, enter a number in the range from 0-4");
        try {
            int index = scanner.nextInt();
            System.out.println("Price in " + index + " day" + " was: " + price[index] + "$");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid input! Please enter a number in the range 0-4! " + e.getMessage());
        }
    }
}
