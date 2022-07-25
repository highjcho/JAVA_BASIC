public class Water extends Menu {

    public Water(Menu decorator) {
        this.name = "Water";
        this.decorator = decorator;
        this.price = 1000;
    }
    @Override
    public String makeCoffee() {
        return decorator.makeCoffee() + " Adding " + name;
    }

    @Override
    public int getCost() {
        return decorator.getCost() + this.price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
