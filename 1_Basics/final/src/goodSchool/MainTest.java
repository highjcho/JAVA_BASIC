package goodSchool;

public class MainTest {
    private static Subject korean;
    private static Subject math;

    private static Subject dance;
    private static Student studentKang;
    private static Student studentKim;
    private static Student studentShin;
    private static Student studentLee;
    private static Student studentHong;
    private static reportSubjectScore report = new reportSubjectScore();

    public static void main(String[] args) {
        createSubject();
        createStudent();
        registerStudent();
        addScore();
        report.reportScore(korean);
        report.reportScore(math);
        report.reportScore(dance);
    }

    private static void addScore() {
        setScore(studentKang, korean, 95);
        setScore(studentKang, math, 56);
        setScore(studentKim, korean, 95);
        setScore(studentKim, math, 98);
        setScore(studentShin, korean, 100);
        setScore(studentShin, math, 88);
        setScore(studentLee, korean, 89);
        setScore(studentLee, math, 95);
        setScore(studentHong, korean, 83);
        setScore(studentHong, math, 56);
        setScore(studentKang, dance, 95);
        setScore(studentKim, dance, 85);
        setScore(studentShin, dance, 55);
    }

    public static void setScore(Student student, Subject subject, int point)
    {
        Score score = new Score(student.getStudentId(), subject, point);
        student.setSubjectScore(score);
    }
    private static void registerStudent() {
        korean.register(studentKang);
        korean.register(studentKim);
        korean.register(studentShin);
        korean.register(studentLee);
        korean.register(studentHong);

        math.register(studentKang);
        math.register(studentKim);
        math.register(studentShin);
        math.register(studentLee);
        math.register(studentHong);

        dance.register(studentKang);
        dance.register(studentKim);
        dance.register(studentShin);
    }

    private static void createStudent() {
        studentKang = new Student(211213, "강감찬", korean);
        studentKim = new Student(212330, "김유신", math);
        studentShin = new Student(201518, "신사임당", korean);
        studentLee = new Student(202360, "이순신", korean);
        studentHong = new Student(201290, "홍길동", math);
    }

    private static void createSubject() {
        korean = new Subject("국어");
        math = new Subject("수학");
        dance = new Subject("댄스");
    }
}
