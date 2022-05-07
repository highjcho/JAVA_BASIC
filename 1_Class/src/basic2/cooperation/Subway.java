package basic2.cooperation;

public class Subway {
    private int line;
    private int fare;
    private int income;
    private int count;

    public Subway(int line) {
        this.line = line;
        this.fare = 1200;
        this.income = 0;
        this.count = 0;
    }

    public int getLine() {
        return this.line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getFare() {
        return this.fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getIncome() {
        return this.income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void showSubwayInfo() {
        System.out.println(this.line + "호선 전철의 승객은 " + this.count + "명이고, 수입은 " + this.income + "입니다.");
    }
}
