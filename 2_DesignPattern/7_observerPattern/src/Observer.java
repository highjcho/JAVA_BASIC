public interface Observer {
    public abstract void update(NumberGenerator generator);
}

class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("<Digit>\n" + generator.getNumber() + "\n");
    }
}

class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("<Graph>");
        for (int i = 0; i < generator.getNumber(); i++)
        {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}