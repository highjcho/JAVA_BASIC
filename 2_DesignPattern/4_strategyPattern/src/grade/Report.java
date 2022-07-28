package grade;

import java.util.ArrayList;

public class Report {
    private static GradeFactory gradeFactory = new GradeFactory();

    private GradeEvaluation evaluation;

    public void showGradeInfo(Student student) {
        for (Subject s : student.subjectList)
        {
            evaluation = gradeFactory.creatGrade(s.getType());
            if (evaluation != null)
                System.out.println("학생 " + student.studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "점 이고, 학점은 " +  evaluation.getGrade(s.getScorePoint()) + "입니다.");
            else
                System.out.println("Invalid grade type. < 1) BASIC 2) MAJOR 3) PF");
        }
    }

    public void showSubjectGradeInfo(Subject subject)
    {
        System.out.println("--------------------------------");
        System.out.println("        " + subject.getName() + " 수강생 학점       ");
        System.out.println("--------------------------------");
        System.out.println("  이름   |  중점과목  | 점수   ");
        for (Student s : subject.getStudentsList())
        {
            Subject sub = s.getSubjectInfo(subject.getName());
            if (sub == null)
                continue;
            evaluation = gradeFactory.creatGrade(sub.getType());
            System.out.println("  " + s.getStudentName() + "  |  " + s.getMajor() + "  |  " + sub.getScorePoint() + " : " + evaluation.getGrade(sub.getScorePoint()));
        }
    }
}
