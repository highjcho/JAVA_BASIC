public class Mocha extends Menu {
    public Mocha(Menu menu) {
        this.name = "Mocha syrup";
        this.decorator = menu;
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
