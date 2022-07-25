public class Milk extends Menu {
    public Milk(Menu menu) {
        this.name = "Milk";
        this.decorator = menu;
        this.price = 2000;
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
