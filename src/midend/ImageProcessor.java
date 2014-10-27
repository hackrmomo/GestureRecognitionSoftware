package midend;

import java.awt.image.BufferedImage;
import java.awt.Image;

public class ImageProcessor {
    private final Image image;
    public ImageProcessor(BufferedImage img){
        this.image = img;
    }
    public ImageProcessor(Image img){
        this.image = img;
    }
    public ImageProcessor(Image img, int frameNumber){
        this.image = img;
    }
}
