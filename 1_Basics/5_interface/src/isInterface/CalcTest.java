package isInterface;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calculator();
        int a = 10;
        int b = 5;

        System.out.println("add     : " + a + " + " + b + " = " + calc.add(a, b));
        System.out.println("subtract: " + a + " - " + b + " = " + calc.subtract(a, b));
        System.out.println("times   : " + a + " * " + b + " = " + calc.times(a, b));
        System.out.println("divide  : " + a + " / " + b + " = " + calc.divide(a, b));
    }
}
