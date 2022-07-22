public class Sonata extends Car {
    public String productName = CarFactory.SONATA;

    @Override
    public String toString() {
        return "Car Name = " + productName;
    }
}
