package basic2.reference;

public class Student {
    private int studentID;
    private String studentName;
    private Subject korean;
    private Subject math;

    public Student(int ID, String name) {
        this.studentID = ID;
        this.studentName = name;
        this.korean = new Subject();
        this.math = new Subject();
    }

    public void setKorean(String name, int score) {
        this.korean.setName(name);
        this.korean.setScore(score);
    }

    public void setMath(String name, int score) {
        this.math.setName(name);
        this.math.setScore(score);
    }

    public void showStudentInfo() {
        String var10001 = this.studentName;
        System.out.println("학생 " + var10001 + "의 총점은 " + (this.korean.getScore() + this.math.getScore()) + "점 입니다.");
    }
}
