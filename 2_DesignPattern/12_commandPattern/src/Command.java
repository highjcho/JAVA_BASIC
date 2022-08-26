public interface Command {
    public void execute();
}

class NoCommand implements Command {
    @Override
    public void execute() {

    }
}
class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}

class CeilingFanOnCommand implements Command {
    CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}

class CeilingFanOffCommand implements Command {
    CeilingFan fan;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }
}

class CeilingFanTurnUpCommand implements Command {
    CeilingFan fan;

    public CeilingFanTurnUpCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnUp();
    }
}

class CeilingFanTurnDownCommand implements Command {
    CeilingFan fan;

    public CeilingFanTurnDownCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnDown();
    }
}

class GarageDoorUpCommand implements Command {
    GarageDoor door;
    public GarageDoorUpCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
}

class GarageDoorDownCommand implements Command {
    GarageDoor door;

    public GarageDoorDownCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }
}

class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.onWithCD();
    }
}

class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}