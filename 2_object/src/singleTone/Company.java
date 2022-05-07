package singleTone;

public class Company {
    private static Company company;

    private Company(){}

    public static Company getInstance()
    {
        if (company == null)
            company = new Company();
        return company;
    }
}
