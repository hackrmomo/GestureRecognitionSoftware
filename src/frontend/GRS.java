package frontend;

import java.util.Scanner;
import com.github.sarxos.webcam.*;


public class GRS {

    static SettingsFrame sf;
    static WebcamRGBFrame df;
    static Webcam wc = Webcam.getDefault();
    static String[] args;

    public static void main(String[] args) throws InterruptedException {
        GRS.args = args;
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
                    WebcamRGBFrame window = new WebcamRGBFrame(wc);
                    
                }
            }
        }
    }
}
