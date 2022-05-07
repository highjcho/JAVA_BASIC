package basic1;

public class Person {
    public String name;
    public int age;
    public String sex;
    public int marriage;
    public int children;

    public Person(String name) {
        this.name = name;
    }

    public void showPersonInfo() {
        System.out.println("이름은 " + this.name + "이고 나이는 " + this.age + "살 입니다.");
        System.out.print("성별은 " + this.sex + "이며, ");
        if (this.marriage == 1) {
            System.out.print("기혼자 입니다. ");
        } else {
            System.out.print("미혼자 입니다. ");
        }

        System.out.println("자녀는 " + this.children + "명이 있습니다.");
    }
}
