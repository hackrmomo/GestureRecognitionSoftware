package frontend_viewcontroller;

import backend_models.GestureRecognition;
import backend_models.WebcamAnalyzer;
//import backend_models.PointerControl;
//import backend_models.SkeletalRecognition;

public class BackendModelsAccessor {

    public final GestureRecognition backGR;
    public final WebcamAnalyzer backIP;
    //public final PointerControl backPC;
    //public final SkeletalRecognition backSR;

    public BackendModelsAccessor() {
        backGR = new GestureRecognition();
        backIP = new WebcamAnalyzer(WebcamAnalyzer.globalCam.getImage());
    }
}
