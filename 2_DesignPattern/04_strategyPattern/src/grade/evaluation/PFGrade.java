package grade.evaluation;

import grade.evaluation.GradeEvaluation;

public class PFGrade implements GradeEvaluation {
    @Override
    public String getGrade(int score) {
        if (score >= 70)
            return "PASS";
        else
            return "FAIL";
    }
}
