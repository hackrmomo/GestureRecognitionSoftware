package frontend;

import com.github.sarxos.webcam.WebcamPanel;
import static frontend.GRS.wc;
import javax.swing.JFrame;

public class DebugFrame extends JFrame {

    public DebugFrame() {
        WebcamPanel panel = new WebcamPanel(wc);
        panel.setFPSDisplayed(true);
        panel.setDisplayDebugInfo(true);
        panel.setImageSizeDisplayed(true);
        panel.setMirrored(true);
        this.setBounds(50, 70, 800, 800);
        this.setEnabled(true);
        this.add(panel);
        this.setResizable(true);
        this.setDefaultCloseOperation(DebugFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    public void lol (){
        
    }
}
