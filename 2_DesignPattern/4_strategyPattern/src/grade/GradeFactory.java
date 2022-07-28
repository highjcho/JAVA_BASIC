package grade;

public class GradeFactory {
    public GradeEvaluation creatGrade(int type)
    {
        GradeEvaluation grade = null;
        if (type == Define.BASIC)
            grade = new BasicGrade();
        else if (type == Define.MAJOR)
            grade = new MajorGrade();
        else if (type == Define.PF)
            grade = new PFGrade();
        return grade;
    }
}
