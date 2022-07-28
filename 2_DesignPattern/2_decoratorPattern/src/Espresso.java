public class Espresso extends Menu {
    public Espresso(Coffee coffee)
    {
        super(coffee);
        this.name = "espresso";
        this.price = 1000;
    }

    @Override
    public String getCoffee() {
        return coffee.getCoffee() + " " + name;
    }

    @Override
    public int getCost() {
        return coffee.getPrice() + this.price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
