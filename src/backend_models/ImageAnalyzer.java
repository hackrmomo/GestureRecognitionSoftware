/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_models;

import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author momo
 */
public class ImageAnalyzer {
    
    private final Image image;

    public ImageAnalyzer(BufferedImage img) {
        this.image = img;
    }

    public ImageAnalyzer(Image img) {
        this.image = img;
    }
}
