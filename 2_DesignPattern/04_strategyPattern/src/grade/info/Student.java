package grade.info;

import grade.evaluation.Define;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    String major;
    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addSubject(String name, int score, int type)
    {
        Subject subject = new Subject(name);
        subject.setScorePoint(score);
        subject.setMajorCode(type);
        if (type == Define.MAJOR)
            this.major = name;
        subjectList.add(subject);
    }

    public String getMajor() {
        return major;
    }

    public Subject getSubjectInfo(String name)
    {
        for (Subject s : subjectList)
        {
            if (s.getName().equalsIgnoreCase(name))
                return s;
        }
        return null;
    }
}
