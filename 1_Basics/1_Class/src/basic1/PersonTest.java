package basic1;

public class PersonTest {
    public static void main(String[] args) {
        Person jane = new Person("제인");
        jane.age = 30;
        jane.sex = "여성";
        jane.marriage = 1;
        jane.children = 1;
        jane.showPersonInfo();
    }
}
