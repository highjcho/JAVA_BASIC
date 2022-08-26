public class Light {
    String location = "";
    public Light(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println(location + " light is on");
    }
    public void off() {
        System.out.println(location + " light is off");
    }
}

class GarageDoor {
    String location;
    public GarageDoor(String location) {
        this.location = location;
    }
    public void up() {
        System.out.println(location + " garage Door is Up");
    }
    public void down() {
        System.out.println(location + " garage Door is Down");
    }
    public void stop() {
        System.out.println(location + " garage Door is Stopped");
    }
    public void lightOn() {
        System.out.println(location + " garage light is on");
    }
    public void lightOff() {
        System.out.println(location + " garage light is off");
    }
}

class CeilingFan {
    String location;
    int strength;
    public CeilingFan(String location) {
        this.location = location;
        this.strength = 1;
    }

    public void on() {
        System.out.println(location + " Ceiling Fan is on");
    }

    public void off() {
        System.out.println(location + " Ceiling Fan is off");
    }

    public void turnUp() {
        if (this.strength < 5)
        {
            this.strength++;
            System.out.println(location + " Ceiling Fan's strength is now " + this.strength);
        }
        else {
            System.out.println(location + " Ceiling Fan's strength is already at the maximum level");
        }
    }

    public void turnDown() {
        if (this.strength > 1)
        {
            this.strength--;
            System.out.println(location + " Ceiling Fan's strength is now " + this.strength);
        }
        else {
            System.out.println(location + " Ceiling Fan's strength is already at the minimum level");
        }
    }

}

class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void onWithCD() {
        System.out.println(location + " Stereo is now played the CD");
    }

    public void off() {
        System.out.println(location + " Stereo is off");
    }
}