package basic2.howToUseThis;

public class This3 {
    private int month;
    private int day;

    public This3(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public This3 getSelf() {
        return this;
    }

    public void showInfo() {
        System.out.println("생일은 " + this.month + "월 " + this.day + "일 입니다.");
    }
}
