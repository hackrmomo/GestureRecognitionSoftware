package backend_models;

import java.awt.image.BufferedImage;
import java.awt.Image;

public class WebCamAnalyzer {
    
    private final Image image;

    public WebCamAnalyzer(BufferedImage img) {
        this.image = img;
    }

    public WebCamAnalyzer(Image img) {
        this.image = img;
    }

    public WebCamAnalyzer(Image img, int frameNumber) {
        this.image = img;
    }
    
}