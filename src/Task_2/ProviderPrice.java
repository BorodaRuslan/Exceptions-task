package Task_2;

import java.util.Random;

public class ProviderPrice {
    public static Random random = new Random();
    public  int[] providerPrice() {
        int[] price = new int[5];
        for (int i = 0; i < 5; i++) {
            price[i] = random.nextInt(5, 50);
        }
        return price;
    }
}
