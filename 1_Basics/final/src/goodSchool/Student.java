package goodSchool;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private Subject majorSubject;
    private String major;
    private ArrayList<Score> scoreList = new ArrayList<>();

    public Student (int studentId, String studentName, Subject majorSubject)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
        if (majorSubject.getSubjectId() == Define.KOREAN)
            major = "국어국문학과";
        else if (majorSubject.getSubjectId() == Define.MATH)
            major = "컴퓨터공학과";
    }

    public void setSubjectScore(Score score)
    {
        scoreList.add(score);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public String getMajor() {
        return major;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }
}
