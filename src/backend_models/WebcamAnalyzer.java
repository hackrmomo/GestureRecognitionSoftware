package backend_models;

import java.awt.image.BufferedImage;
import java.awt.Image;

public class WebcamAnalyzer {
    
    private final Image image;

    public WebcamAnalyzer(BufferedImage img) {
        this.image = img;
    }

    public WebcamAnalyzer(Image img) {
        this.image = img;
    }

    public WebcamAnalyzer(Image img, int frameNumber) {
        this.image = img;
    }
    
}