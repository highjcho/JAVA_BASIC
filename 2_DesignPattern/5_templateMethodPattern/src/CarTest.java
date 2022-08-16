public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("\n======================\n");
        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
