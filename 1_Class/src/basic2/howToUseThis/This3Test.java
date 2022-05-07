package basic2.howToUseThis;

public class This3Test {
    public static void main(String[] args) {
        This3 bDay = new This3(8, 22);
        bDay.showInfo();
        System.out.println("today: " + bDay);
        This3 test = bDay.getSelf();
        System.out.println("this : " + test);
    }
}
