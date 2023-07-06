package Task_3;

public class Client {
    private String name;
    private int age;
    public int moneyOnTheCard;

    public Client(String name, int age, int moneyOnTheCard) {
        this.name = name;
        this.age = age;
        this.moneyOnTheCard = moneyOnTheCard;
    }

    public String getName() {
        return name;
    }

    public int getMoneyOnTheCard() {
        return moneyOnTheCard;
    }
}
