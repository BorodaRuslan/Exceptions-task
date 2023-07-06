package Task_2;

public class Main {
    /*
       Завдання 2
        ------------
       1) Протягом 5 днів фіксувалася різна ціна товару на товарній біржі
       2) Реалізуйте засобами Scanner пошук значення ціни за індексом у масиві цін.
       3) Обробіть неправильне введення індексу.
      */

    public static void main(String[] args) {
        ShowPrice showPrice = new ShowPrice();
        ProviderPrice providerPrice = new ProviderPrice();
        showPrice.showPrice(providerPrice.providerPrice());

    }
}
