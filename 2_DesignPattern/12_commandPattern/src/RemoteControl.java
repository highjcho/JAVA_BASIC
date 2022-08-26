public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    public RemoteControl() {
        this.onCommands = new Command[10];
        this.offCommands = new Command[10];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 10; i++)
        {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int number, Command on, Command off) {
        onCommands[number] = on;
        offCommands[number] = off;
    }

    public void onButtonWasPushed(int number) {
        if (0 <= number && number < 10)
            onCommands[number].execute();
        else
            System.out.println("You can use only 0 ~ 9 commands");
    }

    public void offButtonWasPushed(int number) {
        if (0 <= number && number < 10)
            offCommands[number].execute();
        else
            System.out.println("You can use only 0 ~ 9 commands");
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}