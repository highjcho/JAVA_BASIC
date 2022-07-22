package basic1;

public class StudentTest {
    public static void main(String[] args) {
        Student hong = new Student();
        Student lee = new Student();
        hong.studentID = 1001;
        hong.studentName = "홍길동";
        hong.grade = 2;
        hong.showStudentInfo();
        System.out.println("====================");
        lee.studentName = "이순신";
        System.out.println("lee: " + lee);
    }
}
