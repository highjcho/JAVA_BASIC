public class Kenya extends Coffee{
    public Kenya(){
        this.name = "Kenya";
        this.price = 1500;
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
