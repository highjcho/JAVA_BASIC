package goodSchool;

public class Score {
    private int studentId;
    private Subject subject;
    private int point;

    public Score(int studentId, Subject subject, int point)
    {
        this.studentId = studentId;
        this.subject = subject;
        this.point = point;
    }

    public int getStudentId() {
        return studentId;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getPoint() {
        return point;
    }
}
