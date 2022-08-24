public abstract class Menu extends Coffee{
    protected Coffee coffee;
    protected String name;
    protected int price;
    protected int cost;

    public Menu(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract String getCoffee();

    public abstract int getCost();
    public abstract int getPrice();
}
