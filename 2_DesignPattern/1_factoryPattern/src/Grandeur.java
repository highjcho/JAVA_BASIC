public class Grandeur extends Car {
    public String productName = CarFactory.GRANDEUR;

    @Override
    public String toString() {
        return "Car Name = " + productName;
    }
}
