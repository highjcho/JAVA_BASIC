public class Ethiopia extends Coffee{
    public Ethiopia(){
        this.menu = "Ethiopia";
    }

    @Override
    public String add() {
        return menu + " espresso";
    }
}
