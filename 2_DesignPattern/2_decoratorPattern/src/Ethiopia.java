public class Ethiopia extends Coffee{
    public Ethiopia(){
        this.name = "Ethiopia";
        this.price = 2000;
    }

    @Override
    public String getBean() {
        return name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
