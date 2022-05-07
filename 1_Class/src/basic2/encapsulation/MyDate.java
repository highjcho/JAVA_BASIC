package basic2.encapsulation;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int day, int month, int year) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year >= 1) {
            this.year = year;
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    boolean check_data() {
        if (this.year < 1) {
            return false;
        }
        else {
            switch (this.month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (this.day >= 1 && this.day <= 31)
                        return false;
                    break;
                case 2:
                    if ((this.year % 4 != 0 || this.year % 100 == 0) && this.year % 400 != 0) {
                        if (this.day < 1 || this.day > 28) {
                            return false;
                        }
                    } else if (this.day < 1 || this.day > 29) {
                        return false;
                    }
                    break;
                case 4, 6, 9, 11:
                    if (this.day >= 1 && this.day <= 30) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    public String isValid() {
        return this.check_data() ? this.year + "년 " + this.month + "월 " + this.day + "일은 유효한 날짜입니다." : this.year + "년 " + this.month + "월 " + this.day + "일은 유효하지 않은 날짜입니다.";
    }
}
