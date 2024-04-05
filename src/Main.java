// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
}
class Wallet {
    private double money;


    public double getMoney() {
        System.out.println("Извлекаем денюжку " + money + ":");
        return money;
    }

    public Plane(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        String s = "Кошелек с запасом денег " + money + " рублей";
        return s;
    }

    public void setMoney(double kolvo) {
        System.out.println("Пополняем денежный запас на " + this.money + " рублей");
        this.money = kolvo;
    }
}

