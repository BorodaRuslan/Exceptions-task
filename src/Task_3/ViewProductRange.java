package Task_3;

import java.util.Scanner;

public class ViewProductRange {
    public static Scanner scanner = new Scanner(System.in);
    ModelBuy modelBuy;
    public ViewProductRange(ModelBuy modelBuy) {
        this.modelBuy = modelBuy;
    }

    public void assortment() throws NotEnoughMoneyException {
        System.out.println("""
                1.Audi A3: 10000$
                2.VAZ 2101: 800$
                3.Daewoo Lanos: 1000$
                Enter the number of the car you want to buy!
                 """);

        modelBuy.buyingCar(scanner.nextInt());
    }
}
