package goodSchool;

public class reportSubjectScore {

    public GradeEval[] gradeEvals = {new BasicType(), new MajorType(), new PFType()};

    public void reportScore(Subject subject)
    {
        System.out.println("--------------------------------");
        System.out.println("        " + subject.getSubjectName() + " 수강생 학점       ");
        System.out.println("--------------------------------");
        System.out.println("  이름   |  학번  | 중점과목 | 점수   ");
        for (Student s : subject.getStudentList())
        {
            Score score;
            String grade;
            score = null;
            grade = "F";
            for (Score p : s.getScoreList())
            {
                if (p.getStudentId() == s.getStudentId() && p.getSubject() == subject)
                {
                    score = p;
                    break;
                }
            }
            if (s.getMajorSubject().equals(subject))
                grade = gradeEvals[Define.MAJOR_TYPE].getGrade(score.getPoint());
            else
                grade = gradeEvals[subject.getGradeType()].getGrade(score.getPoint());
            System.out.println(s.getStudentName() + "   | " + s.getStudentId() + " |  " + s.getMajorSubject().getSubjectName() + "  | " + score.getPoint() + ":" + grade);
        }
    }
}
