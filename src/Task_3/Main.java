package Task_3;

public class Main {
     /*
       Завдання 3
       -----------
       1) Реалізуйте валідацію достатньої наявності коштів на карті при оплаті товару.
       2) Введення суми до оплати реалізуйте через Scanner.
       3) Використовуйте trow при обробці виключення..

       */

    public static void main(String[] args) {
        Client client = new Client("Ruslan", 33, 500);
        ViewProductRange viewProductRange = new ViewProductRange(new ModelBuy(client));
        try {
            viewProductRange.assortment();
        } catch (NotEnoughMoneyException e) {
            System.err.println(e.getMessage());
        }
    }

}
