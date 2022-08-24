public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee k = coffeeFactory.createCoffee("kenya");
        Coffee e = coffeeFactory.createCoffee("ethiopia");
        Coffee t = coffeeFactory.createCoffee("today");
        Coffee tEsso = new Espresso(t);
        Coffee kEsso = new Espresso(k);
        Coffee eEsso = new Espresso(e);

        Menu tCoffee = new Water(tEsso);
        System.out.println("오늘의 커피: " + tCoffee.getCoffee() + " - " + tCoffee.getCost() + "원");
        Menu kAmericano = new Water(kEsso);
        System.out.println("아메리카노: " + kAmericano.getCoffee() + " - " + kAmericano.getCost() + "원");
        Menu eLatte = new Milk(eEsso);
        System.out.println("카페라떼: " + eLatte.getCoffee() + " - " + eLatte.getCost() + "원");
        Menu eMochaWhip = new WhippedCream(new Mocha(new Milk(eEsso)));
        System.out.println("카페모카 with 휩크림: " + eMochaWhip.getCoffee() + " - " + eMochaWhip.getCost() + "원");
    }
}
