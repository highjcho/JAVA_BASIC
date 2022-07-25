public class Def extends Coffee{
    public Def(){
        this.name = "Today's bean";
        this.price = 0;
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
