package grade.info;

import java.util.ArrayList;

public class Subject {
    private String name;
    private int scorePoint;
    private int type;
    private ArrayList<Student> studentsList = new ArrayList<Student>();

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }

    public int getType() {
        return type;
    }
    public void setMajorCode(int type) {
        this.type = type;
    }

    public void register(Student student){
        studentsList.add(student);
    }

    public ArrayList<Student> getStudentsList(){
        return studentsList;
    }

}
