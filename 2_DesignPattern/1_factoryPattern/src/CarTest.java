public class CarTest {
    public static void main(String[] args) {
        CarFactory test = new CarFactory();
        Car car = test.createCar("Sonata");
        System.out.println(car);
        Car car2 = test.createCar("Genesis");
        System.out.println(car2);
    }
}
