@FunctionalInterface
interface MyNumber {
    int getMax(int num1, int num2);
}

public class RamdaTest {
    public static void main(String[] args) {
        MyNumber max = (x, y) -> (x >= y) ? x : y;

        System.out.println(max.getMax(10, 20));
    }
}
