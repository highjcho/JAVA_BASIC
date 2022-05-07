package basic2.cooperation;

public class Bus {
    private int num;
    private int fare;
    private int income;
    private int count;

    public Bus(int num) {
        this.num = num;
        this.fare = 1000;
        this.income = 0;
        this.count = 0;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public void showBusInfo() {
        System.out.println(this.num + "번 버스의 승객은 " + this.count + "명이고, 수입은 " + this.income + "입니다.");
    }
}
