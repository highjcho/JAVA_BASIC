public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빨리 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("높이 Jump 합니다");
    }

    @Override
    public void turn() {
        System.out.println("Turn 조금 할 수 있지롱");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("===== Advanced Level ====");
    }
}
