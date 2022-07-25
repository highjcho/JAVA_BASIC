public class WhippedCream extends Menu {

    public WhippedCream(Menu decorator) {
        this.name = "Whipped Cream";
        this.decorator = decorator;
        this.price = 500;
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
