public class Kenya extends Coffee{
    public Kenya(){
        this.name = "Kenya";
        this.price = 1500;
    }

    @Override
    public String getCoffee() {
        return this.name;
    }

    @Override
    public int getCost() {
        return this.price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
