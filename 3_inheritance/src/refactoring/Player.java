package refactoring;

public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    int level;
    public Player() {
        level = BEGINNER_LEVEL;
    }

    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    public void run() {
        System.out.println("천천히 달립니다.");
    }

    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    public void play(int time) {
        run();
        for(int i =0; i<time; i++)
            jump();
        turn();
    }

    public Player upgradeLevel(int level) {
        this.level = level;
        if (this.level == ADVANCED_LEVEL)
            return new AdvancedPlayer();
        else if (this.level == SUPER_LEVEL)
            return new SuperPlayer();
        else
            return new Player();
    }
}
