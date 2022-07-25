public class Espresso extends Menu {
    private Coffee coffee;

    public Espresso(Coffee coffee)
    {
        this.name = "espresso";
        this.coffee = coffee;
        this.price = 1000;
    }

    @Override
    public String makeCoffee() {
        return coffee.getBean() + " " + name;
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
