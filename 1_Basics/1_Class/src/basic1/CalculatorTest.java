package basic1;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator(15, 3);
        System.out.println("num1: 15, num2: 3");
        System.out.println("=================");
        System.out.println("add: " + cal.add());
        System.out.println("minus: " + cal.minus());
        System.out.println("multiple: " + cal.multiple());
        System.out.println("divide: " + cal.divide());
    }
}
