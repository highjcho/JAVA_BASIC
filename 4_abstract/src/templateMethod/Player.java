package templateMethod;

public class Player {
    protected PlayerLevel level = new BeginnerLevel();

    public PlayerLevel getLevel() {
        return level;
    }

    public void play(int times) {
        level.go(times);
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
    }
}
