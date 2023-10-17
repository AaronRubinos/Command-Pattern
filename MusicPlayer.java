package SoftEng1;
public class MusicPlayer implements Device {
    private boolean isOn;
    private int volume;
    private String currentSong;

    public MusicPlayer() {
        isOn = false;
        volume = 50; // Set an initial volume
        currentSong = "No song playing";
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Music player is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Music player is OFF");
    }

    @Override
    public void increase() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume increased to " + volume);
        }
    }

    @Override
    public void decrease() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume decreased to " + volume);
        }
    }

    @Override
    public void playSong(String songName) {
        currentSong = songName;
        System.out.println("Playing song: " + songName);
    }

    @Override
    public void stopPlayback() {
        currentSong = "No song playing";
        System.out.println("Music playback stopped");
    }
}
