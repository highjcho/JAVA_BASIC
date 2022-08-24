public interface Mediator {
    void execute(Component sender, String event);
}

class AuthenticationDialog implements Mediator {
    public String title;
    public CheckBox isJoinForm;

    public TextBox loginUserName;
    public TextBox loginPwd;

    public TextBox regUsername;
    public TextBox regPwd;
    public TextBox regEmail;

    public Button ok;
    public Button cancel;

    public CheckBox rememberMe;

    public AuthenticationDialog() {
        title = "Login";
        isJoinForm = new CheckBox(this);

        loginUserName = new TextBox(this);
        loginPwd = new TextBox(this);
        regUsername = new TextBox(this);
        regPwd = new TextBox(this);
        regEmail = new TextBox(this);

        ok = new Button(this);
        cancel = new Button(this);

        rememberMe = new CheckBox(this);
    }

    public void printCurrentStatus() {
        System.out.println("Title: " + title);
        System.out.println("isJoinForm: " + isJoinForm.checked());
        System.out.println("rememberMe: " + rememberMe.checked());
    }

    @Override
    public void execute(Component sender, String event) {
        if (sender.equals(ok) && "click".equals(event)) {
            if (isJoinForm.checked()) {
                System.out.println("Validate [regUsername, regPwd, regEmail] elements");
            }
            else
                System.out.println("Login!");
        }
        else if (sender.equals(isJoinForm) && "check".equals(event)) {
            if(isJoinForm.checked()) {
                title = "User Join Form";
                System.out.println("show [regUsername, regPassword, regEmail] elements");
            }
            else {
                title = "Login";
                System.out.println("hide [regUsername, regPassword, regEmail] elements");
            }
        }
        else if(sender.equals(rememberMe) && "check".equals(event)) {

            if(rememberMe.checked()) {
                System.out.println("set ID in cookie");
            }
            else {
                System.out.println("remove ID from cookie");
            }
        }
    }
}