package basic2.encapsulation;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2003);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isValid());
        date1.setDay(29);
        System.out.println(date1.isValid());
        date2.setMonth(15);
        System.out.println(date2.isValid());
        date2.setMonth(2);
        System.out.println(date2.isValid());
    }
}
