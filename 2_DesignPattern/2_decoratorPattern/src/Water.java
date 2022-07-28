public class Water extends Menu {

    public Water(Coffee coffee) {
        super(coffee);
        this.name = "Water";
        this.price = 1000;
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
