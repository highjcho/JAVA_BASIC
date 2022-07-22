public class Genesis extends Car {
    public String productName = CarFactory.GENESIS;

    @Override
    public String toString() {
        return "Car Name=" + productName;
    }
}
