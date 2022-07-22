public class CoffeeFactory {
    public Coffee createCoffee(String bean)
    {
        if (bean.equalsIgnoreCase("kenya")){
            return new Kenya();
        }
        else if (bean.equalsIgnoreCase("ethiopia")){
            return new Ethiopia();
        }
        else {
            return new Def();
        }
    }
}
