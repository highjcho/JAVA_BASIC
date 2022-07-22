public class Kenya extends Coffee{
    public Kenya(){
        this.menu = "Kenya";
    }

    @Override
    public String add() {
        return menu + " espresso";
    }
}
