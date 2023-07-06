package Task_3;

public class ModelBuy {
    Client client;

    public ModelBuy(Client client) {
        this.client = client;
    }
    public void buyingCar(int idCar) throws NotEnoughMoneyException {
        switch (idCar) {
            case 1 -> {
                if (client.getMoneyOnTheCard() >= 10000) {
                    System.out.println("Congratulations you bought Audi A3");
                } else {
                    throw new NotEnoughMoneyException("You don't have enough money!");
                }
            }
            case 2 -> {
                if (client.getMoneyOnTheCard() >= 800) {
                    System.out.println("Congratulations you bought VAZ 2101");
                } else {
                    throw new NotEnoughMoneyException("You don't have enough money!");
                }
            }
            case 3 -> {
                if (client.getMoneyOnTheCard() >= 1000) {
                    System.out.println("Congratulations you bought Daewoo Lanos");
                } else {
                    throw new NotEnoughMoneyException("You don't have enough money!");
                }
            }
        }

    }
}
