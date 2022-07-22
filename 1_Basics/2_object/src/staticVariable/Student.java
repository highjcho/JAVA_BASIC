package staticVariable;

public class Student {

    private static int serialNum = 1000;
    private String studentName;
    private int studentID;


    public Student()
    {
        serialNum++;
        this.studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public static int getSerialNum() {
        return serialNum;
    }
}
