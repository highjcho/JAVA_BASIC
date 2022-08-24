public class Component {
    protected Mediator dialog;

    public Component(Mediator dialog) {
        this.dialog = dialog;
    }

    public void click() {
        dialog.execute(this, "click");
    }

    public void keypress() {
        dialog.execute(this, "keypress");
    }
}


class Button extends Component {
    public Button(Mediator dialog) {
        super(dialog);
    }
}

class TextBox extends Component {
    public TextBox(Mediator dialog) {
        super(dialog);
    }
}

class CheckBox extends Component {
    private boolean checked;
    public CheckBox(Mediator dialog) {
        super(dialog);
        checked = false;
    }

    public boolean checked() {
        return checked;
    }

    @Override
    public void click() {
        checked = !checked;
        dialog.execute(this, "check");
        super.click();
    }
}