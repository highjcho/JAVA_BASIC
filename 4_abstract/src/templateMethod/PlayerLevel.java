package templateMethod;

public abstract class PlayerLevel {
    protected abstract void run();
    protected abstract void jump();
    protected abstract void turn();
    protected abstract void showLevelMessage();
    final protected void go(int times)
    {
        showLevelMessage();
        run();
        for(int i = 0; i < times; i++)
            jump();
        turn();
    }
}
