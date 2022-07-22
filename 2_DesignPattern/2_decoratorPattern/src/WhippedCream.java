public class WhippedCream extends Coffee {
    private Coffee coffee;

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String add() {
        return coffee.add() + " Adding Whipped Cream";
    }
}
