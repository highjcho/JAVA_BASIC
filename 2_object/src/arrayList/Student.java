package arrayList;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private ArrayList<Subject> studentInfo;


    public Student(int studentID, String studentName)
    {
        this.studentID = studentID;
        this.studentName = studentName;
        studentInfo = new ArrayList<Subject>();
    }

    public void addSubject(String subject, int score)
    {
        studentInfo.add(new Subject(subject, score));
    }

    public void showStudentInfo()
    {
        int total = 0;

        for (Subject s: studentInfo)
        {
            System.out.println("학생(학번: " + this.studentID + ") " + this.studentName + "의 " + s.getSubject() + "과목 성적은 " + s.getScore() + "점 입니다.");
            total += s.getScore();
        }
        System.out.println("학생 " + this.studentName + "의 총점은 " + total + "점 입니다.");
    }
}
