public class CarFactory {
    public static final String SONATA = "Sonata";
    public static final String GRANDEUR = "Grandeur";
    public static final String GENESIS = "Genesis";
    public String productName;

    public Car createCar(String productName)
    {
        Car car = null;
        if (productName.equalsIgnoreCase(SONATA))
            car = new Sonata();
        else if (productName.equalsIgnoreCase(GRANDEUR))
            car = new Grandeur();
        else if (productName.equalsIgnoreCase(GENESIS))
            car = new Genesis();
        return car;
    }
}
