public class Player {
    public PlayerLevel level;
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;

    public Player() {
        this.level = new BeginnerLevel();
        this.level.showLevelMessage();
    }

    public void upgradeLevel(int level)
    {
        if (level == ADVANCED_LEVEL)
            this.level = new AdvancedLevel();
        else if (level == SUPER_LEVEL)
            this.level = new SuperLevel();
        this.level.showLevelMessage();
    }

    public void play(int time)
    {
        level.go(time);
    }
}
