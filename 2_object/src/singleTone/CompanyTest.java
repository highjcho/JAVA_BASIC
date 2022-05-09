package singleTone;

public class CompanyTest {
    public static void main(String[] args) {
        Company myCompany1 = Company.getInstance(); // 스태틱 메소드 클래스로 직접 접근 가능
        Company myCompany2 = Company.getInstance();
        // Company company = new Company() // 오류
        System.out.println( myCompany1 == myCompany2 ); }
}
