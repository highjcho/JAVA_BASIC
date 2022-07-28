public class Ethiopia extends Coffee{
    public Ethiopia(){
        this.name = "Ethiopia";
        this.price = 2000;
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
