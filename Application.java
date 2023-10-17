package SoftEng1;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        int option = 0, input = 0;

        Light light = new Light();
        CentralHub rc = new CentralHub(light);

        Thermostat thermostat = new Thermostat();
        CentralHub rc1 = new CentralHub(thermostat);

        MusicPlayer musicPlayer = new MusicPlayer();
        CentralHub rc2 = new CentralHub(musicPlayer);

        Scanner sc = new Scanner(System.in);

        while(true) {

        System.out.print("[1]Light\n" +
                            "[2]Thermostat\n" +
                            "[3]Music Player\n" +
                            "[4]Exit\n" +
                            "Select Appliance: ");
        option = sc.nextInt();

        System.out.println();

        switch(option) {
            case 1:
                System.out.print("[1]Turn On\n" +
                                    "[2]Turn Off\n" +
                                    "[3]Increase Brightness\n" +
                                    "[4]Decrease Brightness\n");
                input = sc.nextInt();

                switch(input) {
                    case 1:
                        rc.turnOn();
                        System.out.println();
                        break;
                    case 2:
                        rc.turnOff();
                        System.out.println();
                        break;
                    case 3:
                        rc.increaseBrightness();
                        System.out.println();
                        break;
                    case 4:
                        rc.decreaseBrightness();
                        System.out.println();
                        break;
                    default:
                        System.out.print("Wrong Input!");
                        break;
                    }
                break;

            case 2:
                System.out.print("[1]Turn On\n" +
                                    "[2]Turn Off\n" +
                                    "[3]Increase Temp\n" +
                                    "[4]Decrease Temp\n");
                input = sc.nextInt();

                switch(input) {
                    case 1:
                        rc1.On();
                        System.out.println();
                        break;
                    case 2:
                        rc1.Off();
                        System.out.println();
                        break;
                    case 3:
                        rc1.increaseTemperature();
                        System.out.println();
                        break;
                    case 4:
                        rc1.decreaseTemperature();
                        System.out.println();
                        break;
                    default:
                        System.out.print("Wrong Input!");
                        break;
                }
                break;

            case 3:
                System.out.print("[1]Turn On\n" +
                        "[2]Turn Off\n" +
                        "[3]Increase Volume\n" +
                        "[4]Decrease Volume\n" +
                        "[5]Play Song\n" +
                        "[6]Stop Playback\n");
                input = sc.nextInt();

                switch(input) {
                    case 1:
                        rc2.onTurn();
                        System.out.println();
                        break;
                    case 2:
                        rc2.offTurn();
                        System.out.println();
                        break;
                    case 3:
                        rc2.increaseVolume();
                        System.out.println();
                        break;
                    case 4:
                        rc2.decreaseVolume();
                        System.out.println();
                        break;
                    case 5:
                        rc2.playSong("The End So Far");
                        System.out.println();
                        break;
                    case 6:
                        rc2.stopPlayback();
                        System.out.println();
                        break;
                    default:
                        System.out.print("Wrong Input!");
                        break;
                }
                break;

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("Wrong input!");
        }
        }
    }
}
