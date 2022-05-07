package basic1;

public class Calculator {
    public int num1;
    public int num2;

    public Calculator(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int minus() {
        return this.num1 - this.num2;
    }

    public int multiple() {
        return this.num1 * this.num2;
    }

    public int divide() {
        return this.num1 / this.num2;
    }
}
