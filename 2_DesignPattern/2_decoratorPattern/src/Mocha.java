public class Mocha extends Coffee {
    private Coffee coffee;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String add() {
        return coffee.add() + " Adding Mocha";
    }
}
