import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for(Observer ob: observers){
            ob.update(this);
        }
    }
    public abstract int getNumber();
    public abstract void execute();
}

class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    public int getNumber() {
        return number;
    }
    public void execute() {
        number = random.nextInt(15);
        notifyObservers();
    }
}