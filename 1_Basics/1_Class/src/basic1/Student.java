package basic1;

public class Student {
    public int studentID;
    public String studentName;
    public int grade;

    public void showStudentInfo() {
        System.out.println("학번: " + this.studentID);
        System.out.println("이름: " + this.studentName);
        System.out.println("학년: " + this.grade + "학년");
    }
}
