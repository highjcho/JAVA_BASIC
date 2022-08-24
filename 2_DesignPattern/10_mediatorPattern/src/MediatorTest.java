public class MediatorTest {
    public static void main(String[] args) {

        AuthenticationDialog dialog = new AuthenticationDialog();

        System.out.println("==== 1.Current state");
        dialog.printCurrentStatus();

        System.out.println();
        System.out.println("==== 2. Convert from login to user join form");
        dialog.isJoinForm.click();
        dialog.printCurrentStatus();

        System.out.println();
        System.out.println("==== 3. submit user join");
        dialog.ok.click();
        dialog.printCurrentStatus();

        System.out.println();
        System.out.println("==== 4. Convert from user join to login");
        dialog.isJoinForm.click();
        dialog.printCurrentStatus();

        System.out.println();
        System.out.println("==== 5. Check remember me");
        dialog.rememberMe.click();
        dialog.printCurrentStatus();

        System.out.println();
        System.out.println("==== 6. Do login");
        dialog.ok.click();
        dialog.printCurrentStatus();
    }
}
