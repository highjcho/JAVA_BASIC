package refactoring2;

public class Player {
    private PlayerComposition playerComposition;
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    int level;
    public Player() {
        level = BEGINNER_LEVEL;
        playerComposition = getPlayerComposition(this.level);
    }

    private PlayerComposition getPlayerComposition(int level) {
        if (level == ADVANCED_LEVEL)
            return new AdvancedComposition();
        else if (level == SUPER_LEVEL)
            return new SuperComposition();
        else
            return new BeginnerComposition();
    }

    public void jump()
    {
        playerComposition.jump();
    }

    public void run()
    {
        playerComposition.run();
    }

    public void turn()
    {
        playerComposition.turn();
    }

    public void play(int time) {
        run();
        for(int i =0; i<time; i++)
            jump();
        turn();
    }

    public void upgradeLevel(int level) {
        if (this.level == level) {
            return;
        }
        this.level = level;
        playerComposition = getPlayerComposition(this.level);
    }
}
