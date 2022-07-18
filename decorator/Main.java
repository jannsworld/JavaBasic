package decorator;

public class Main {
    public static void main(String[] args) {

        ICar audi = new Audi(1000);
        audi.showPrice();

        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        // upgrade
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();
    }
}
