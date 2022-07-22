package goodSchool;

public class PFType implements GradeEval{
    @Override
    public String getGrade(int point) {
        if (point >= 70)
            return "P";
        return "F";
    }
}
