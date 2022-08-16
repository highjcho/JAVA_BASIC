package grade.info;

import grade.evaluation.Define;

public class StudentTest {
    public static Student studentLee;
    public static Student studentKim;
    public static Subject korean;
    public static Subject math;
    public static Subject soccer;
    public static Subject english;

    public static void main(String[] args) {
        Report report = new Report();
        createStudent();
        createSubject();
        registerStudent();

        report.showGradeInfo(studentLee);
        System.out.println("\n==============================================\n");
        report.showGradeInfo(studentKim);
        System.out.println();
        report.showSubjectGradeInfo(korean);
        System.out.println();
        report.showSubjectGradeInfo(math);
        System.out.println();
        report.showSubjectGradeInfo(english);
        System.out.println();
        report.showSubjectGradeInfo(soccer);
    }

    private static void createStudent() {
        studentLee = new Student(1001, "Lee");
        studentKim = new Student(1002, "Kim");
    }

    private static void createSubject() {
        korean = new Subject("국어");
        math = new Subject("수학");
        soccer = new Subject("축구");
        english = new Subject("영어");
    }

    public static void registerStudent()
    {
        studentLee.addSubject("국어", 100, Define.BASIC);
        studentLee.addSubject("수학", 100, Define.MAJOR);
        studentLee.addSubject("축구", 60, Define.PF);
        studentKim.addSubject("국어", 55, Define.MAJOR);
        studentKim.addSubject("수학", 55, Define.BASIC);
        studentKim.addSubject("영어", 100, Define.BASIC);
        studentKim.addSubject("축구", 80, Define.PF);
        korean.register(studentLee);
        korean.register(studentKim);
        math.register(studentLee);
        math.register(studentKim);
        soccer.register(studentLee);
        soccer.register(studentKim);
        english.register(studentKim);
    }
}
