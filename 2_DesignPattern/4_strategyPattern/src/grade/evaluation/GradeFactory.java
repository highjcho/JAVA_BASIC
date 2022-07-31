package grade.evaluation;

public class GradeFactory {
    public static GradeEvaluation basic;
    public static GradeEvaluation major;
    public static GradeEvaluation pf;

    public GradeEvaluation getGrade(int type)
    {
        if (type == Define.BASIC)
        {
            if (basic == null)
                basic = new BasicGrade();
            return basic;
        }
        else if (type == Define.MAJOR)
        {
            if (major == null)
                major = new MajorGrade();
            return major;
        }
        else if (type == Define.PF)
        {
            if (pf == null)
                pf = new PFGrade();
            return pf;
        }
        return null;
    }
}
