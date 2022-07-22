public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee kenya = coffeeFactory.createCoffee("kenya");
        Coffee ethiopia = coffeeFactory.createCoffee("ethiopia");
        Coffee today = coffeeFactory.createCoffee("today");

        Coffee kenyaAmericano = new Water(kenya);
        System.out.println("음료: " + kenyaAmericano.add());
        Coffee kenMocha = new Mocha(new Milk(kenya));
        System.out.println("음료: " + kenMocha.add());
        Coffee ethWhipLatte = new WhippedCream(new Milk(ethiopia));
        System.out.println("음료: " + ethWhipLatte.add());
    }
}
