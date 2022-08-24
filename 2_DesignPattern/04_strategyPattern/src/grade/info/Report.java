package grade.info;

import grade.evaluation.GradeEvaluation;
import grade.evaluation.GradeFactory;

public class Report {
    private static GradeFactory gradeFactory = new GradeFactory();

    private GradeEvaluation evaluation;

    public void showGradeInfo(Student student) {
        for (Subject s : student.subjectList)
        {
            evaluation = gradeFactory.getGrade(s.getType());
            if (evaluation != null)
                System.out.println("학생 " + student.studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "점 이고, 학점은 " +  evaluation.getGrade(s.getScorePoint()) + "입니다.");
            else
                System.out.println("오류: 학생 " + student.studentName + "의 학점 평가 기준이 올바르지 않습니다. 다시 입력해 주세요. Usage: 1) BASIC 2) MAJOR 3) PF");
        }
    }

    public void showSubjectGradeInfo(Subject subject)
    {
        System.out.println("--------------------------------");
        System.out.println("        " + subject.getName() + " 수강생 학점       ");
        System.out.println("--------------------------------");
        System.out.println("  이름  | 중점과목 |  점수 : 등급  ");
        for (Student s : subject.getStudentsList())
        {
            Subject sub = s.getSubjectInfo(subject.getName());
            if (sub == null)
                continue;
            evaluation = gradeFactory.getGrade(sub.getType());
            if (evaluation != null)
                System.out.println("  " + s.getStudentName() + "   |  " + s.getMajor() + "  |  " + sub.getScorePoint() + " : " + evaluation.getGrade(sub.getScorePoint()));
            else
                System.out.println("오류: 학생 " + s.studentName + "의 " + sub.getName() + "과목 학점 평가 기준이 올바르지 않습니다. 다시 입력해 주세요. Usage: 1) BASIC 2) MAJOR 3) PF");
        }
    }
}
