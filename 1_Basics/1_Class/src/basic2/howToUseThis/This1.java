package basic2.howToUseThis;

public class This1 {
    private String food;
    private String sport;
    private String hobby;

    public This1(String food, String sport, String hobby) {
        this.food = food;
        this.sport = sport;
        this.hobby = hobby;
    }

    public void showInfo() {
        System.out.println("==================");
        System.out.println("좋아하는 음식: " + this.food);
        System.out.println("좋아하는 운동: " + this.sport);
        System.out.println("좋아하는 취미: " + this.hobby);
        System.out.println("==================");
    }
}
