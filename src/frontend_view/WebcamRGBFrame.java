package frontend_view;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class WebcamRGBFrame extends JFrame {

    public WebcamRGBFrame(Webcam wc) {
        this.initialize(wc);
    }

    private void initialize(Webcam wc) {
        WebcamPanel panel = new WebcamPanel(wc);
        panel.setFPSDisplayed(true);
        panel.setDisplayDebugInfo(true);
        panel.setImageSizeDisplayed(true);
        panel.setMirrored(true);
        this.setBounds(50, 70, 800, 800);
        this.setEnabled(true);
        this.add(panel);
        this.setResizable(true);
        this.setDefaultCloseOperation(WebcamRGBFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setTitle("Debug Frame *Will be Removed*");
        WindowEvent es = new WindowEvent(this, 0);
    }

}
