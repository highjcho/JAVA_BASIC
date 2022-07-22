package refactoring;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        player = player.upgradeLevel(Player.ADVANCED_LEVEL);
        player.play(2);
        player = player.upgradeLevel(Player.SUPER_LEVEL);
        player.play(3);
    }
}

//    public void jump() {
//        if(level == BEGINNER_LEVEL)
//            System.out.println("Jump 할 줄 모르지롱.");
//        else if(level == ADVANCED_LEVEL)
//            System.out.println("높이 jump 합니다.");
//        else if(level == SUPER_LEVEL)
//            System.out.println("아주 높이 jump 합니다.");
//    }
//    public void run() {
//        if(level == BEGINNER_LEVEL)
//            System.out.println("천천히 달립니다.");
//        else if(level == ADVANCED_LEVEL)
//            System.out.println("빨리 달립니다.");
//        else if(level == SUPER_LEVEL)
//            System.out.println("엄청 빨리 달립니다.");
//    }
//    public void turn() {
//        if (level == BEGINNER_LEVEL)
//            System.out.println("Turn 할 줄 모르지롱.");
//        else if (level == ADVANCED_LEVEL)
//            System.out.println("Turn 할 줄 모르지롱.");
//        else if (level == SUPER_LEVEL)
//            System.out.println("한 바퀴 돕니다.");
//    }