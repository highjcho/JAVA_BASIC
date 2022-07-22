package basic2.cooperation;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        this.money -= bus.getFare();
        bus.setIncome(bus.getIncome() + bus.getFare());
        bus.setCount(bus.getCount() + 1);
    }

    public void takeSubway(Subway subway) {
        this.money -= subway.getFare();
        subway.setIncome(subway.getIncome() + subway.getFare());
        subway.setCount(subway.getCount() + 1);
    }

    public void showInfo() {
        System.out.println(this.name + "의 남은 돈은 " + this.money + "원 입니다.");
    }
}
