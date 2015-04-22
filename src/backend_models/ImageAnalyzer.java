/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_models;

//When calling the image analyzer you probably need these
//import boofcv.abst.feature.associate.ScoreAssociation;
//import boofcv.abst.feature.detect.interest.ConfigFastHessian;
//import boofcv.factory.feature.associate.FactoryAssociation;
//import boofcv.factory.feature.detdesc.FactoryDetectDescribe;
//import boofcv.io.image.UtilImageIO;
//import boofcv.struct.image.ImageFloat32;
//import java.awt.image.BufferedImage;
//import boofcv.gui.feature.AssociationPanel;
//import boofcv.gui.image.ShowImages;

import boofcv.abst.feature.associate.AssociateDescription;
import boofcv.abst.feature.detdesc.DetectDescribePoint;
import boofcv.alg.feature.UtilFeature;
import boofcv.core.image.ConvertBufferedImage;
import boofcv.struct.feature.TupleDesc;
import boofcv.struct.image.ImageSingleBand;
import georegression.struct.point.Point2D_F64;
import java.util.List;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import org.ddogleg.struct.FastQueue;

/**
 *
 * @author momo
 * @param <T>
 * @param <TD>
 */
public class ImageAnalyzer<T extends ImageSingleBand, TD extends TupleDesc> {
    
    // algorithm used to detect and describe interest points
    DetectDescribePoint<T, TD> detDesc;
    // Associated descriptions together by minimizing an error metric
    AssociateDescription<TD> associate;
    
    // location of interest points
    public List<Point2D_F64> pointsA;
    public List<Point2D_F64> pointsB;
    
    Class<T> imageType;
    
    public ImageAnalyzer(DetectDescribePoint<T, TD> detDesc, AssociateDescription<TD> associate, Class<T> imageType) {
        this.detDesc = detDesc;
        this.associate = associate;
        this.imageType = imageType;
    }
    
    public void associate(BufferedImage imageA, BufferedImage imageB) {
        T inputA = ConvertBufferedImage.convertFromSingle(imageA, null, imageType);
        T inputB = ConvertBufferedImage.convertFromSingle(imageB, null, imageType);
        
        // stores the location of detected interest points
        pointsA = new ArrayList<>();
        pointsB = new ArrayList<>();
        
        // stores the description of detected interest points
        FastQueue<TD> descA = UtilFeature.createQueue(detDesc, 10);
        FastQueue<TD> descB = UtilFeature.createQueue(detDesc, 10);
        
        // describe each image using interest points
        describeImage(inputA, pointsA, descA);
        describeImage(inputB, pointsB, descB);
        
        // Associate features between the two images
        associate.setSource(descA);
        associate.setDestination(descB);
        associate.associate();
        
//        // display the results
//        AssociationPanel panel = new AssociationPanel(20);
//        panel.setAssociation(pointsA, pointsB, associate.getMatches());
//        panel.setImages(imageA, imageB);
//        
//        ShowImages.showWindow(panel, "Associated Features");
    }
    
    /**
     * Detects features inside the two images and computes descriptions at those
     * points.
     */
    private void describeImage(T input, List<Point2D_F64> points, FastQueue<TD> descs) {
        detDesc.detect(input);

        for (int i = 0; i < detDesc.getNumberOfFeatures(); i++) {
            points.add(detDesc.getLocation(i).copy());
            descs.grow().setTo(detDesc.getDescription(i));
        }
    }
    
//    public static void main(String args[]) {
//
//        Class imageType = ImageFloat32.class;
//
//        // select which algorithms to use
//        DetectDescribePoint detDesc = FactoryDetectDescribe.surfStable(new ConfigFastHessian(1, 2, 10, 1, 9, 4, 4), null, null, imageType);
//
//        ScoreAssociation scorer = FactoryAssociation.defaultScore(detDesc.getDescriptionType());
//        AssociateDescription associate = FactoryAssociation.greedy(scorer, Double.MAX_VALUE, true);
//
//        // load and match images
//        ExampleAssociatePoints app = new ExampleAssociatePoints(detDesc, associate, imageType);
//
//        BufferedImage imageA = UtilImageIO.loadImage("TestingGRS.png");
//        BufferedImage imageB = UtilImageIO.loadImage("IMG_1284.JPG");
//        BufferedImage imageC = UtilImageIO.loadImage("IMG_1285.JPG");
//        BufferedImage imageD = UtilImageIO.loadImage("IMG_1286.PNG");
//
//        app.associate(imageA, imageC);
//    }
}
