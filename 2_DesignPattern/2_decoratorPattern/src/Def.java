public class Def extends Coffee{
    public Def(){
        this.menu = "Today's bean";
    }

    @Override
    public String add() {
        return menu + " espresso";
    }
}
