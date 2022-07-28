public class Milk extends Menu {
    public Milk(Coffee coffee) {
        super(coffee);
        this.name = "Milk";
        this.price = 2000;
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
