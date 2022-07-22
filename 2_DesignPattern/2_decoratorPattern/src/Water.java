public class Water extends Coffee {
    private Coffee coffee;

    public Water(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String add() {
        return coffee.add() + " Adding Water";
    }
}
