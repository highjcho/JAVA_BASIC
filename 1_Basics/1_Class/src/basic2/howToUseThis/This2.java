package basic2.howToUseThis;

public class This2 {
    private String name;
    private String coalition;
    private String subject;
    private int blackHole;

    public This2() {
        this("noname", "Gam", "libft", 200);
    }

    public This2(String name, String coalition, String subject, int blackHole) {
        this.name = name;
        this.coalition = coalition;
        this.subject = subject;
        this.blackHole = blackHole;
    }

    public void showInfo() {
        System.out.println("=============================");
        System.out.println("ID        : " + this.name);
        System.out.println("Coalition : " + this.coalition);
        System.out.println("Progress  : " + this.subject);
        System.out.println("Black Hole: " + this.blackHole + "days left");
        System.out.println("=============================");
    }
}
