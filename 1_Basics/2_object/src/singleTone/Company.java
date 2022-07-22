package singleTone;

public class Company {
    private static Company company;
    private Company(){}

    public static Company getInstance() // 인스턴스 생성 전에 호출해야 하기 때문에 스태틱 메소드 활용
    {
        if (company == null)
            company = new Company();
        return company;
    }
}
