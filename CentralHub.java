package SoftEng1;
public class CentralHub {
    private Light light;
    private Thermostat thermostat;
    private MusicPlayer musicPlayer;

    public CentralHub(Light light) {
        this.light = light;
    }

    public void turnOn() {
        light.turnOn();
    }

    public void turnOff() {
        light.turnOff();
    }

    public void increaseBrightness() {
        light.increase();
    }

    public void decreaseBrightness() {
        light.decrease();
    }

    public CentralHub(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void On() {
        thermostat.turnOn();
    }

    public void Off() {
        thermostat.turnOff();
    }

    public void increaseTemperature() {
        thermostat.increase();
    }

    public void decreaseTemperature() {
        thermostat.decrease();
    }

    public CentralHub(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void onTurn() {
        musicPlayer.turnOn();
    }

    public void offTurn() {
        musicPlayer.turnOff();
    }

    public void increaseVolume() {
        musicPlayer.increase();
    }

    public void decreaseVolume() {
        musicPlayer.decrease();
    }

    public void playSong(String songName) {
        musicPlayer.playSong(songName);
    }

    public void stopPlayback() {
        musicPlayer.stopPlayback();
    }
}

