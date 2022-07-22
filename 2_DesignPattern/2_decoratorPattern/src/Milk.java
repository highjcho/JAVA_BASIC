public class Milk extends Coffee {
    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String add() {
        return coffee.add() + " Adding Milk";
    }
}
