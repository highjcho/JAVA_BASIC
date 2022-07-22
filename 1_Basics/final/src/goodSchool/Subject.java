package goodSchool;

import java.util.ArrayList;

public class Subject {
    private int subjectId;
    private String subjectName;
    private int gradeType;
    private ArrayList<Student> studentList = new ArrayList<>();

    public Subject (String subjectName)
    {
        this.subjectName = subjectName;
        if (subjectName.equals("국어"))
            subjectId = Define.KOREAN;
        else if (subjectName.equals("수학"))
            subjectId = Define.MATH;
        else
            subjectId = Define.DANCE;
        gradeType = Define.BASIC_TYPE;
        if (subjectName.equals("댄스"))
            gradeType = Define.PF_TYPE;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void register(Student student)
    {
        studentList.add(student);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public int getGradeType() {
        return gradeType;
    }
}
