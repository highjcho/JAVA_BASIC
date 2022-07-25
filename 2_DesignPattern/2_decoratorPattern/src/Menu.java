public abstract class Menu {
    protected String name;
    protected Menu decorator;
    protected int price;
    protected int cost;

    public abstract String makeCoffee();

    public abstract int getCost();
    public abstract int getPrice();
}
