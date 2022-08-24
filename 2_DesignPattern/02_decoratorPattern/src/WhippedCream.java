public class WhippedCream extends Menu {

    public WhippedCream(Coffee coffee) {
        super(coffee);
        this.name = "Whipped Cream";
        this.price = 500;
    }

    @Override
    public String getCoffee() {
        return coffee.getCoffee() + " Adding " + name;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + this.price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
