public class Mocha extends Menu {
    public Mocha(Coffee coffee) {
        super(coffee);
        this.name = "Mocha syrup";
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
