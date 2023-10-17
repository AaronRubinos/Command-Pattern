package SoftEng1;
public class Light implements Device {
    private boolean isOn;

    public Light() {
        isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light is OFF");
    }

    @Override
    public void increase() {
        System.out.println("Brightness Increased!");
    }

    @Override
    public void decrease() {
        System.out.println("Brightness Decreased!");
    }

    @Override
    public void playSong(String songName) {

    }

    @Override
    public void stopPlayback() {

    }
}
