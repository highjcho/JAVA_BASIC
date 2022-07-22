package inheritance;

public class MyClass implements MyInterface{

    @Override
    public void myMethod() {
        System.out.println("My Method");
    }

    @Override
    public void x() {
        System.out.println("Method X: This is X");
    }

    @Override
    public void y() {
        System.out.println("Method Y: This is Y");
    }
}
