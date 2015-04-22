package backend_models;

import com.github.sarxos.webcam.Webcam;
import java.awt.image.BufferedImage;
import java.awt.Image;

public class WebcamAnalyzer {

    private final Image image;
    public static final Webcam globalCam = Webcam.getDefault();
    public static BufferedImage imageAtPoint;

    //Average color of hand, just for reference: #9f8878
    //With contrast: #703e2f @+100% and brightness@-55%
    //THIS IS THE BETTER ONE
    //Fingers have black added to them
    //Tollerance for eraser = 23%

    public WebcamAnalyzer(BufferedImage img) {
        this.image = img;
        backend_models.WebcamAnalyzer.imageAtPoint = backend_models.WebcamAnalyzer.globalCam.getImage();
        backend_models.WebcamAnalyzer.imageAtPoint = initImage(backend_models.WebcamAnalyzer.imageAtPoint);
    }

    private BufferedImage initImage(BufferedImage img) {
        applyBlack(img);
        return img;
    }

    private BufferedImage applyBlack(BufferedImage img) {
        return img;
    }

}
