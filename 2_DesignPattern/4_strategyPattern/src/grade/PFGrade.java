package grade;

public class PFGrade implements GradeEvaluation{
    @Override
    public String getGrade(int score) {
        if (score >= 70)
            return "PASS";
        else
            return "FAIL";
    }
}
