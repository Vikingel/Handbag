// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Wallet w1=new Wallet("Кошелек1 с ",1000);
        String s1 = w1.toString();
        System.out.println(w1);
    }
}
class Wallet {
    private double money;
    private String name;


    public double getMoney() {
        System.out.println("Извлекаем денюжку " + money + ":");
        return money;
    }

    public Wallet(String name,double money) {
        this.name = name;
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

