package SoftEng1;
public class Thermostat implements Device {
    private int temperature;

    public Thermostat() {
        temperature = 20; // Set an initial temperature
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is OFF");
    }

    @Override
    public void increase() {
        temperature++;
        System.out.println("Temperature increased to " + temperature);
    }

    @Override
    public void decrease() {
        temperature--;
        System.out.println("Temperature decreased to " + temperature);
    }

    @Override
    public void playSong(String songName) {

    }

    @Override
    public void stopPlayback() {

    }
}
