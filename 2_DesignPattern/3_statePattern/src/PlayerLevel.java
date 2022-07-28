public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();
    final public void go(int time)
    {
        showLevelMessage();
        System.out.println();
        run();
        for (int i = 0; i < time; i++) {
            jump();
        }
        turn();
        System.out.println();
    }
}
