package goodSchool;

public class MajorType implements GradeEval{
    @Override
    public String getGrade(int point) {
        if (point >= 95)
            return "S";
        else if (point >= 90 && point <= 94)
            return "A";
        else if (point >= 80 && point <= 89)
            return "B";
        else if (point >= 70 && point <= 79)
            return "C";
        else if (point >= 60 && point <= 69)
            return "D";
        else
            return "F";
    }
}
