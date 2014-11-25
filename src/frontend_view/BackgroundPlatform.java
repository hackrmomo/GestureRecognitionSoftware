package frontend_view;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import java.util.Scanner;

public class BackgroundPlatform {
    private static SettingsFrame sf;
    private static WebcamRGBFrame df;
    public static Webcam wc = Webcam.getDefault();
    
    public static void initialize(){
        Scanner commandIntake = new Scanner(System.in);
        wc.open();
        wc.getImage();
        while (true) {
            if (commandIntake.hasNextLine()) {
                String commandReceived = commandIntake.nextLine();
                if (commandReceived.equals("settings".toLowerCase())) {
                    sf = new SettingsFrame();
                } else if (commandReceived.equals("debug".toLowerCase())) {
                    wc.close();
                    wc.setViewSize(WebcamResolution.VGA.getSize());
                    wc.open();
                    df = new WebcamRGBFrame(wc);

                }
            }
        }
    }
}
