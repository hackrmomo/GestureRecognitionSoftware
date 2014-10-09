package frontend;

import java.util.Scanner;
import com.github.sarxos.webcam.*;
import java.awt.Dimension;
import midend.Keyboard;

public class GRS {

    static SettingsFrame sf;
    static DebugFrame df;
    static Webcam wc = Webcam.getDefault();
    static Keyboard kb = new Keyboard();

    public static void main(String[] args) throws InterruptedException {
        Scanner commandIntake = new Scanner(System.in);
        wc.open();
        wc.getImage();
        while (true) {
            if (commandIntake.hasNextLine()) {
                String commandReceived = commandIntake.nextLine();
                if (commandReceived.equals("settings".toLowerCase())) {
                    sf = new SettingsFrame();
                    sf.setVisible(true);
                } else if (commandReceived.equals("debug".toLowerCase())) {
                    wc.close();
                    wc.setViewSize(WebcamResolution.VGA.getSize());
                    wc.open();
                    DebugFrame window = new DebugFrame();
                }
            }
        }
    }
}
